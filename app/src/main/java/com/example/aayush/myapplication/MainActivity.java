package com.example.aayush.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.DownloadManager;

public class MainActivity extends Activity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               DownloadManager downloadManager;
                downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("http://montblancmarmores.com.br/wp-content/uploads/2016/06/test-document-pdf.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri)
                        .setTitle("Random file")
                        .setDescription("Hello").setMimeType("pdf").setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);

            }
        });
    }
}
