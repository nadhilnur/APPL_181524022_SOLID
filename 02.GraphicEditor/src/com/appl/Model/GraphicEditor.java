package com.appl.Model;

import com.appl.Interface.IShape;

public class GraphicEditor {

	public void DrawShape(IShape shape) {
		System.out.println(shape.Draw());
	}
}
