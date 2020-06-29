package com.appl;

import com.appl.Model.Circle;
import com.appl.Model.GraphicEditor;
import com.appl.Model.Rectangle;
import com.appl.Model.Square;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		Square square = new Square();
		
		GraphicEditor editor = new GraphicEditor();
		editor.DrawShape(circle);
		editor.DrawShape(rect);
		editor.DrawShape(square);
	}

}
