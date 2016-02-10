package test_controls.work.sokur.com.controls;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);

        ImageView imageView = (ImageView)findViewById(R.id.image3);

        imageView.setImageResource(R.drawable.icon);

        imageView.setImageBitmap(BitmapFactory.decodeResource(
                this.getResources(), R.drawable.manatee14));

        imageView.setImageDrawable(Drawable.createFromPath("/mnt/sdcard/dave2.jpg"));

        imageView.setImageURI(Uri.parse("file://mnt/sdcard/dave2.jpg"));
    }
}
