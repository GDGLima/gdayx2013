package com.gdglima.gdayx2013.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

public class ImageUtils {
	
	public static Bitmap getCircularBitmap(Bitmap bitmap) 
	{
		Bitmap output=null;
		output = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getHeight(), Config.ARGB_8888);
		Canvas canvas = new Canvas(output);
		
		final int color = 0xff424242;
	    final Paint paint = new Paint();
	    final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
	    
	    float r = 0;
	    r = bitmap.getWidth() / 2;
	    paint.setAntiAlias(true);
	    canvas.drawARGB(0, 0, 0, 0);
	    paint.setColor(color);
	    canvas.drawCircle(r, r, r, paint);
	    paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
	    
	    canvas.drawBitmap(bitmap, rect, rect, paint);
	    
		return output;
	}

}
