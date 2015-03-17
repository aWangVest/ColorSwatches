package tv.sanrenxing.awang.swatches.demo;

import tv.sanrenxing.awang.swatches.R;
import tv.sanrenxing.awang.swatches.SwatchesView;
import tv.sanrenxing.awang.swatches.SwatchesView.OnColorSelectedListener;
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
		SwatchesView swatches = (SwatchesView) findViewById(R.id.swatches);
		swatches.setOnColorSelectedListener(new OnColorSelectedListener() {
			
			@Override
			public void onSelect(int color) {
				textView.setTextColor(Color.WHITE);
				textView.setText("" + color);
				textView.setBackgroundColor(color);
			}
		});
	}
}