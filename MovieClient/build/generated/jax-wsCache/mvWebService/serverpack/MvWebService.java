
package serverpack;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "mvWebService", targetNamespace = "http://serverpack/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MvWebService {


    /**
     * 
     * @param nodeID
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "serchbyID", targetNamespace = "http://serverpack/", className = "serverpack.SerchbyID")
    @ResponseWrapper(localName = "serchbyIDResponse", targetNamespace = "http://serverpack/", className = "serverpack.SerchbyIDResponse")
    @Action(input = "http://serverpack/mvWebService/serchbyIDRequest", output = "http://serverpack/mvWebService/serchbyIDResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/serchbyID/Fault/Exception")
    })
    public String serchbyID(
        @WebParam(name = "nodeID", targetNamespace = "")
        int nodeID)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nodeID
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DeleteMovie")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteMovie", targetNamespace = "http://serverpack/", className = "serverpack.DeleteMovie")
    @ResponseWrapper(localName = "DeleteMovieResponse", targetNamespace = "http://serverpack/", className = "serverpack.DeleteMovieResponse")
    @Action(input = "http://serverpack/mvWebService/DeleteMovieRequest", output = "http://serverpack/mvWebService/DeleteMovieResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/DeleteMovie/Fault/Exception")
    })
    public String deleteMovie(
        @WebParam(name = "nodeID", targetNamespace = "")
        int nodeID)
        throws Exception_Exception
    ;

    /**
     * 
     * @param types
     * @param year
     * @param director
     * @param time
     * @param title
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://serverpack/", className = "serverpack.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://serverpack/", className = "serverpack.AddMovieResponse")
    @Action(input = "http://serverpack/mvWebService/addMovieRequest", output = "http://serverpack/mvWebService/addMovieResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/addMovie/Fault/Exception")
    })
    public String addMovie(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "year", targetNamespace = "")
        String year,
        @WebParam(name = "types", targetNamespace = "")
        String types,
        @WebParam(name = "time", targetNamespace = "")
        int time,
        @WebParam(name = "director", targetNamespace = "")
        String director)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nodeID
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "Edit")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Edit", targetNamespace = "http://serverpack/", className = "serverpack.Edit")
    @ResponseWrapper(localName = "EditResponse", targetNamespace = "http://serverpack/", className = "serverpack.EditResponse")
    @Action(input = "http://serverpack/mvWebService/EditRequest", output = "http://serverpack/mvWebService/EditResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/Edit/Fault/Exception")
    })
    public String edit(
        @WebParam(name = "nodeID", targetNamespace = "")
        int nodeID)
        throws Exception_Exception
    ;

    /**
     * 
     * @param types
     * @param year
     * @param director
     * @param time
     * @param title
     * @param nodeID
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "Save")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Save", targetNamespace = "http://serverpack/", className = "serverpack.Save")
    @ResponseWrapper(localName = "SaveResponse", targetNamespace = "http://serverpack/", className = "serverpack.SaveResponse")
    @Action(input = "http://serverpack/mvWebService/SaveRequest", output = "http://serverpack/mvWebService/SaveResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/Save/Fault/Exception")
    })
    public String save(
        @WebParam(name = "nodeID", targetNamespace = "")
        int nodeID,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "year", targetNamespace = "")
        String year,
        @WebParam(name = "types", targetNamespace = "")
        String types,
        @WebParam(name = "time", targetNamespace = "")
        String time,
        @WebParam(name = "director", targetNamespace = "")
        String director)
        throws Exception_Exception
    ;

    /**
     * 
     * @param search
     * @param category
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchQue1", targetNamespace = "http://serverpack/", className = "serverpack.SearchQue1")
    @ResponseWrapper(localName = "searchQue1Response", targetNamespace = "http://serverpack/", className = "serverpack.SearchQue1Response")
    @Action(input = "http://serverpack/mvWebService/searchQue1Request", output = "http://serverpack/mvWebService/searchQue1Response", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/searchQue1/Fault/Exception")
    })
    public String searchQue1(
        @WebParam(name = "category", targetNamespace = "")
        String category,
        @WebParam(name = "search", targetNamespace = "")
        String search)
        throws Exception_Exception
    ;

    /**
     * 
     * @param conditon
     * @param secondNum
     * @param category
     * @param firstNum
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchQue2", targetNamespace = "http://serverpack/", className = "serverpack.SearchQue2")
    @ResponseWrapper(localName = "searchQue2Response", targetNamespace = "http://serverpack/", className = "serverpack.SearchQue2Response")
    @Action(input = "http://serverpack/mvWebService/searchQue2Request", output = "http://serverpack/mvWebService/searchQue2Response", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://serverpack/mvWebService/searchQue2/Fault/Exception")
    })
    public String searchQue2(
        @WebParam(name = "category", targetNamespace = "")
        String category,
        @WebParam(name = "conditon", targetNamespace = "")
        String conditon,
        @WebParam(name = "firstNum", targetNamespace = "")
        int firstNum,
        @WebParam(name = "secondNum", targetNamespace = "")
        int secondNum)
        throws Exception_Exception
    ;

}
