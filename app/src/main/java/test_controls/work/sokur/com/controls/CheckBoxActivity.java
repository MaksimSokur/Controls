package test_controls.work.sokur.com.controls;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        CheckBox fishCB = (CheckBox)findViewById(R.id.fishCB);
        if(fishCB.isChecked())
            fishCB.toggle();

        fishCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("CheckBoxActivity", "The fish checkbox is now "
                + (isChecked?"checked":"not checked"));
            }});
    }
    public void doClick(View view){
        Log.v("CheckBoxActivity", "The steak checkbox is now " +
                (((CheckBox)view).isChecked()?"checked":"not checked"));
    }
}
