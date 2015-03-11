package tv.sanrenxing.awang.swatches.demo;

import tv.sanrenxing.awang.swatches.R;
import tv.sanrenxing.awang.swatches.Swatches;
import tv.sanrenxing.awang.swatches.Swatches.ColorSelectedListener;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.textView);
		Swatches swatches = (Swatches) findViewById(R.id.swatches);
		swatches.setColorSelectedListener(new ColorSelectedListener() {

			@Override
			public void onColorSelected(int color) {
				textView.setBackgroundColor(color);
				textView.setTextColor(Color.WHITE);
				textView.setText("Color : " + color);
			}
		});
	}
}