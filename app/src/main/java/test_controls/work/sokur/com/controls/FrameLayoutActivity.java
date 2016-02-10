package test_controls.work.sokur.com.controls;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayoutActivity extends Activity {
    private ImageView one = null;
    private ImageView two = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);

        one = (ImageView)findViewById(R.id.oneImgView);
        two = (ImageView)findViewById(R.id.twoImgView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }});

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }});
    }
}
