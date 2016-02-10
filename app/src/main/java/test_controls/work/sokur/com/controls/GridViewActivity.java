package test_controls.work.sokur.com.controls;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleCursorAdapter;

import static android.provider.ContactsContract.*;

public class GridViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        GridView gv = (GridView)findViewById(R.id.gridView);

        Cursor cursor = managedQuery(Contacts.CONTENT_URI,null,null,null
                                    ,Contacts.DISPLAY_NAME);

        String[] cols = new String[]{Contacts.DISPLAY_NAME};
        int[] views = new int[] {android.R.id.text1};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                cursor,cols,views);
        gv.setAdapter(adapter);
    }
}
