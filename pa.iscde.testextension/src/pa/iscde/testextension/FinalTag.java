package pa.iscde.testextension;

import java.awt.Color;

import pa.iscde.javadoc.export.parser.JavaDocCustomTag;
import pa.iscde.javadoc.export.style.AnnotationStyleI;
import pa.iscde.javadoc.export.style.StyleToolBox;
import pt.iscde.javadoc.annotations.mfane.JavaDocCustomAnnotationExtension;

public class FinalTag implements JavaDocCustomAnnotationExtension {

    @Override
    public JavaDocCustomTag getJavaDocCustomTag() {
	return new JavaDocCustomTag() {
	    
	    @Override
	    public String getTagName() {
		return "final";
	    }
	    
	    @Override
	    public String getHeaderName() {
		return "Final";
	    }
	    
	    @Override
	    public int nColumns() {
		return 5;
	    }
	    
	    @Override
	    public String getColumnSeparator() {
		return ",";
	    }
	    
	    @Override
	    public AnnotationStyleI[] getAnnotationStyle() {
		return new AnnotationStyleI[] {
			//Link formado pelo URL na coluna 0, o alias na coluna 4
			//O false, indica que não vai ser omitido o URL na geração do JavaDoc
			StyleToolBox.LinkStyle(0, 4, false),
			//Indica que na coluna 0, o conteudo vai estar a verde
			StyleToolBox.ColorGreenStyle(new int[] { 0 } ),
			//Indica que na coluna 1, o conteudo vai estar a Bold
			StyleToolBox.BoldStyle(new int[] { 1 } ),
			//Indica que na coluna 1, o conteudo vai estar a vermelho
			StyleToolBox.ColorRedStyle(new int[] { 1 } ),
			//Indica que na coluna 1, o conteudo vai estar a Italico
			StyleToolBox.ItalicStyle(new int[] { 1 } ),
			//Indica que na coluna 3, o conteudo vai estar a cizento, italico e negrito
			StyleToolBox.BoldStyle(3),
			StyleToolBox.ItalicStyle(3),
			StyleToolBox.ColorStyle(Color.CYAN, 3)
		};
	    }
	};
    }
}
