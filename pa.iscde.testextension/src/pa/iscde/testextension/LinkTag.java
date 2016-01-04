package pa.iscde.testextension;

import java.awt.Color;

import pa.iscde.javadoc.export.parser.JavaDocCustomTag;
import pa.iscde.javadoc.export.style.AnnotationStyleI;
import pa.iscde.javadoc.export.style.StyleToolBox;
import pt.iscde.javadoc.annotations.mfane.JavaDocCustomAnnotationExtension;

public class LinkTag implements JavaDocCustomAnnotationExtension {

    @Override
    public JavaDocCustomTag getJavaDocCustomTag() {
	return new JavaDocCustomTag() {

	    @Override
	    public String getTagName() {
		return "link";
	    }

	    @Override
	    public String getHeaderName() {
		return "Link";
	    }

	    @Override
	    public int nColumns() {
		return 4;
	    }
	    
	    @Override
	    public String getColumnSeparator() {
		return ";";
	    }

	    @Override
	    public AnnotationStyleI[] getAnnotationStyle() {
		return new AnnotationStyleI[] { 
			StyleToolBox.LinkStyle(0, 1), 
			StyleToolBox.BoldStyle(2),
			// StyleToolBox.ItalicStyle(new int[] { 3 }),
			StyleToolBox.ColorRedStyle(new int[] { 2 }), 
			StyleToolBox.ColorGreenStyle(new int[] { 1 }), 
			// StyleToolBox.ColorBlueStyle(new int[] { 3 }),
			StyleToolBox.ColorStyle(Color.YELLOW, 3),
			StyleToolBox.ColorStyle(Color.ORANGE, 3)
		};
	    }
	};
    }
}