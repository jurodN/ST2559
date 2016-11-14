
package serverpack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverpack package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://serverpack/", "Exception");
    private final static QName _Edit_QNAME = new QName("http://serverpack/", "Edit");
    private final static QName _DeleteMovie_QNAME = new QName("http://serverpack/", "DeleteMovie");
    private final static QName _SerchbyID_QNAME = new QName("http://serverpack/", "serchbyID");
    private final static QName _SerchbyIDResponse_QNAME = new QName("http://serverpack/", "serchbyIDResponse");
    private final static QName _EditResponse_QNAME = new QName("http://serverpack/", "EditResponse");
    private final static QName _SearchQue1Response_QNAME = new QName("http://serverpack/", "searchQue1Response");
    private final static QName _SearchQue1_QNAME = new QName("http://serverpack/", "searchQue1");
    private final static QName _SearchQue2_QNAME = new QName("http://serverpack/", "searchQue2");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://serverpack/", "DeleteMovieResponse");
    private final static QName _Save_QNAME = new QName("http://serverpack/", "Save");
    private final static QName _AddMovie_QNAME = new QName("http://serverpack/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://serverpack/", "addMovieResponse");
    private final static QName _SaveResponse_QNAME = new QName("http://serverpack/", "SaveResponse");
    private final static QName _SearchQue2Response_QNAME = new QName("http://serverpack/", "searchQue2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link SerchbyIDResponse }
     * 
     */
    public SerchbyIDResponse createSerchbyIDResponse() {
        return new SerchbyIDResponse();
    }

    /**
     * Create an instance of {@link SerchbyID }
     * 
     */
    public SerchbyID createSerchbyID() {
        return new SerchbyID();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SearchQue2Response }
     * 
     */
    public SearchQue2Response createSearchQue2Response() {
        return new SearchQue2Response();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link SearchQue2 }
     * 
     */
    public SearchQue2 createSearchQue2() {
        return new SearchQue2();
    }

    /**
     * Create an instance of {@link SearchQue1 }
     * 
     */
    public SearchQue1 createSearchQue1() {
        return new SearchQue1();
    }

    /**
     * Create an instance of {@link SearchQue1Response }
     * 
     */
    public SearchQue1Response createSearchQue1Response() {
        return new SearchQue1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "Edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "DeleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerchbyID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "serchbyID")
    public JAXBElement<SerchbyID> createSerchbyID(SerchbyID value) {
        return new JAXBElement<SerchbyID>(_SerchbyID_QNAME, SerchbyID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerchbyIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "serchbyIDResponse")
    public JAXBElement<SerchbyIDResponse> createSerchbyIDResponse(SerchbyIDResponse value) {
        return new JAXBElement<SerchbyIDResponse>(_SerchbyIDResponse_QNAME, SerchbyIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "EditResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(_EditResponse_QNAME, EditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQue1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "searchQue1Response")
    public JAXBElement<SearchQue1Response> createSearchQue1Response(SearchQue1Response value) {
        return new JAXBElement<SearchQue1Response>(_SearchQue1Response_QNAME, SearchQue1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQue1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "searchQue1")
    public JAXBElement<SearchQue1> createSearchQue1(SearchQue1 value) {
        return new JAXBElement<SearchQue1>(_SearchQue1_QNAME, SearchQue1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQue2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "searchQue2")
    public JAXBElement<SearchQue2> createSearchQue2(SearchQue2 value) {
        return new JAXBElement<SearchQue2>(_SearchQue2_QNAME, SearchQue2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "DeleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "Save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "SaveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQue2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "searchQue2Response")
    public JAXBElement<SearchQue2Response> createSearchQue2Response(SearchQue2Response value) {
        return new JAXBElement<SearchQue2Response>(_SearchQue2Response_QNAME, SearchQue2Response.class, null, value);
    }

}
