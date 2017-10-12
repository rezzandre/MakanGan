package rezzandre.example.com.tastindo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sam on 10/12/2017.
 */

public class DetailActivity extends AppCompatActivity {
    ImageView imgDetailImage;
    TextView txtDetailJudul, txtDetailDeskripsi, txtDetailBahan, txtDetailCara;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgDetailImage = (ImageView)findViewById(R.id.img_detail_image);
        txtDetailJudul = (TextView)findViewById(R.id.txt_detail_judul);
        txtDetailDeskripsi = (TextView)findViewById(R.id.txt_detail_deskripi);

        getData();
    }

    private void getData(){
        txtDetailJudul.setText(getIntent().getStringExtra("id_judul"));
        txtDetailDeskripsi.setText(getIntent().getStringExtra("id_desc"));
    }
}
