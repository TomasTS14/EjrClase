import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ConversorAXML {
	
	public static void convertirArrayAxml(Biblioteca biblio, String nuevoArchivo) {
		
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			Element raizElement = doc.createElement("Biblioteca");
			doc.appendChild(raizElement);
			for (Libro libro : biblio.getLibros()) {
				Element libroElement = doc.createElement("libro");
				Element libroTitulo = doc.createElement("titulo");
				Element  libroAutor = doc.createElement("autor");
				Element libroEditorial = doc.createElement("editorial");
				Element libroNumPaginas = doc.createElement("paginas");
				
				raizElement.appendChild(libroElement);
				libroElement.appendChild(libroTitulo);
				libroElement.appendChild(libroAutor);
				libroElement.appendChild(libroEditorial);
				libroElement.appendChild(libroNumPaginas);
				
				libroTitulo.appendChild(doc.createTextNode(libro.getTitulo()));
				libroAutor.appendChild(doc.createTextNode(libro.getAutor()));
				libroEditorial.appendChild(doc.createTextNode(libro.getEditorial()));
				libroNumPaginas.appendChild(doc.createTextNode(libro.getNumPaginas()+""));
				
			}
			Transformer transformer = TransformerFactory.newInstance().newTransformer();	
			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(nuevoArchivo));
			
			transformer.transform(source, result);
			
			
		}catch(ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
	}

}
