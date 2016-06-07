package kr.hs.emirim.young24.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//모든 것들이 필드에 올라감
        Button but = (Button)findViewById(R.id.but_dialog);
        but.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this); //this 또는 getApplicationContext()
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is message part.");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("OK",null);//~,버튼이 클릭되었을 때 감시되는 버튼
        dialog.show();
    }
}
