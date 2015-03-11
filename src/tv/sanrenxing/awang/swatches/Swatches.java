package tv.sanrenxing.awang.swatches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * 取色板
 * 
 * @author aWang
 * @since 2015-3-11
 */
public class Swatches extends View {

	private Paint paint = null;
	private Context context = null;

	private float cx = 0;
	private float cy = 0;
	private float radius = 0;

	private int margin = 10;
	private int mWidth = 0;
	private int mHeight = 0;

	public Swatches(Context context) {
		this(context, null);
	}

	public Swatches(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public Swatches(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;

		paint = new Paint();
		paint.setColor(Color.RED);
	}

	protected void debug() {
		Log.v(VIEW_LOG_TAG, "---------------------");
		Log.i(VIEW_LOG_TAG, "getWidth - " + this.getWidth());
		Log.i(VIEW_LOG_TAG, "getHeight - " + this.getHeight());
		Log.i(VIEW_LOG_TAG, "getMeasuredWidth - " + this.getMeasuredWidth());
		Log.i(VIEW_LOG_TAG, "getMeasuredHeight - " + this.getMeasuredHeight());
		DisplayMetrics dm = context.getResources().getDisplayMetrics();
		Log.d(VIEW_LOG_TAG, "---------------------");
		Log.i(VIEW_LOG_TAG, "widthPixels - " + dm.widthPixels);
		Log.i(VIEW_LOG_TAG, "heightPixels - " + dm.heightPixels);
		Log.i(VIEW_LOG_TAG, "density - " + dm.density);
		Log.i(VIEW_LOG_TAG, "densityDpi - " + dm.densityDpi);
		Log.i(VIEW_LOG_TAG, "scaledDensity - " + dm.scaledDensity);
		Log.i(VIEW_LOG_TAG, "xdpi - " + dm.xdpi);
		Log.i(VIEW_LOG_TAG, "ydpi - " + dm.ydpi);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		Log.d(VIEW_LOG_TAG, "onMeasure()");
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	public void layout(int l, int t, int r, int b) {
		Log.d(VIEW_LOG_TAG, "layout()");
		super.layout(l, t, r, b);
		Log.d(VIEW_LOG_TAG, "l = " + l);
		Log.d(VIEW_LOG_TAG, "t = " + t);
		Log.d(VIEW_LOG_TAG, "r = " + r);
		Log.d(VIEW_LOG_TAG, "b = " + b);
		
		mWidth = r - l;
		mHeight = b - t;
		radius = (Math.min(mWidth, mHeight) - margin) / 2;
		cx = l + mWidth / 2;
		cy = t + mHeight / 2;
		Log.d(VIEW_LOG_TAG, "mWidth = " + mWidth);
		Log.d(VIEW_LOG_TAG, "mHeight = " + mHeight);
		Log.d(VIEW_LOG_TAG, "radius = " + radius);
		Log.d(VIEW_LOG_TAG, "cx = " + cx);
		Log.d(VIEW_LOG_TAG, "cy = " + cy);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		Log.d(VIEW_LOG_TAG, "onDraw()");
		super.onDraw(canvas);
		canvas.drawCircle(cx, cy, radius, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return super.onTouchEvent(event);
	}
}