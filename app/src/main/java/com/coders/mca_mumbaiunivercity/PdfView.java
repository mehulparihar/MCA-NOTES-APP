package com.coders.mca_mumbaiunivercity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class PdfView extends AppCompatActivity {
    private PDFView pdfVieW;
    private StorageReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        Intent intent = getIntent();
        pdfVieW = findViewById(R.id.pdfView);
        reference = FirebaseStorage.getInstance().getReference().child(intent.getStringExtra("topic") + ".pdf");
        try {
            File localfile = File.createTempFile("temp", "pdf");
            reference.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    if(taskSnapshot == null) Toast.makeText(PdfView.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
                    pdfVieW.fromFile(localfile).nightMode(true).scrollHandle(new DefaultScrollHandle(PdfView.this)).load();
                }
            });
        } catch (IOException e) {
            Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }
}