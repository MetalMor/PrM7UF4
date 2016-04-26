
package ppt.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ppt.ws package. 
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

    private final static QName _NotFoundException_QNAME = new QName("http://ws.ppt/", "NotFoundException");
    private final static QName _AcabarJoc_QNAME = new QName("http://ws.ppt/", "acabarJoc");
    private final static QName _AcabarJocResponse_QNAME = new QName("http://ws.ppt/", "acabarJocResponse");
    private final static QName _AfegirJugador_QNAME = new QName("http://ws.ppt/", "afegirJugador");
    private final static QName _AfegirJugadorResponse_QNAME = new QName("http://ws.ppt/", "afegirJugadorResponse");
    private final static QName _ConsultarEstatPartida_QNAME = new QName("http://ws.ppt/", "consultarEstatPartida");
    private final static QName _ConsultarEstatPartidaResponse_QNAME = new QName("http://ws.ppt/", "consultarEstatPartidaResponse");
    private final static QName _GetPartidas_QNAME = new QName("http://ws.ppt/", "getPartidas");
    private final static QName _GetPartidasResponse_QNAME = new QName("http://ws.ppt/", "getPartidasResponse");
    private final static QName _IniciarJoc_QNAME = new QName("http://ws.ppt/", "iniciarJoc");
    private final static QName _IniciarJocResponse_QNAME = new QName("http://ws.ppt/", "iniciarJocResponse");
    private final static QName _MoureJugador_QNAME = new QName("http://ws.ppt/", "moureJugador");
    private final static QName _MoureJugadorResponse_QNAME = new QName("http://ws.ppt/", "moureJugadorResponse");
    private final static QName _SetPartidas_QNAME = new QName("http://ws.ppt/", "setPartidas");
    private final static QName _SetPartidasResponse_QNAME = new QName("http://ws.ppt/", "setPartidasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ppt.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotFoundException }
     * 
     */
    public NotFoundException createNotFoundException() {
        return new NotFoundException();
    }

    /**
     * Create an instance of {@link AcabarJoc }
     * 
     */
    public AcabarJoc createAcabarJoc() {
        return new AcabarJoc();
    }

    /**
     * Create an instance of {@link AcabarJocResponse }
     * 
     */
    public AcabarJocResponse createAcabarJocResponse() {
        return new AcabarJocResponse();
    }

    /**
     * Create an instance of {@link AfegirJugador }
     * 
     */
    public AfegirJugador createAfegirJugador() {
        return new AfegirJugador();
    }

    /**
     * Create an instance of {@link AfegirJugadorResponse }
     * 
     */
    public AfegirJugadorResponse createAfegirJugadorResponse() {
        return new AfegirJugadorResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstatPartida }
     * 
     */
    public ConsultarEstatPartida createConsultarEstatPartida() {
        return new ConsultarEstatPartida();
    }

    /**
     * Create an instance of {@link ConsultarEstatPartidaResponse }
     * 
     */
    public ConsultarEstatPartidaResponse createConsultarEstatPartidaResponse() {
        return new ConsultarEstatPartidaResponse();
    }

    /**
     * Create an instance of {@link GetPartidas }
     * 
     */
    public GetPartidas createGetPartidas() {
        return new GetPartidas();
    }

    /**
     * Create an instance of {@link GetPartidasResponse }
     * 
     */
    public GetPartidasResponse createGetPartidasResponse() {
        return new GetPartidasResponse();
    }

    /**
     * Create an instance of {@link IniciarJoc }
     * 
     */
    public IniciarJoc createIniciarJoc() {
        return new IniciarJoc();
    }

    /**
     * Create an instance of {@link IniciarJocResponse }
     * 
     */
    public IniciarJocResponse createIniciarJocResponse() {
        return new IniciarJocResponse();
    }

    /**
     * Create an instance of {@link MoureJugador }
     * 
     */
    public MoureJugador createMoureJugador() {
        return new MoureJugador();
    }

    /**
     * Create an instance of {@link MoureJugadorResponse }
     * 
     */
    public MoureJugadorResponse createMoureJugadorResponse() {
        return new MoureJugadorResponse();
    }

    /**
     * Create an instance of {@link SetPartidas }
     * 
     */
    public SetPartidas createSetPartidas() {
        return new SetPartidas();
    }

    /**
     * Create an instance of {@link SetPartidasResponse }
     * 
     */
    public SetPartidasResponse createSetPartidasResponse() {
        return new SetPartidasResponse();
    }

    /**
     * Create an instance of {@link Partida }
     * 
     */
    public Partida createPartida() {
        return new Partida();
    }

    /**
     * Create an instance of {@link Jugador }
     * 
     */
    public Jugador createJugador() {
        return new Jugador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "NotFoundException")
    public JAXBElement<NotFoundException> createNotFoundException(NotFoundException value) {
        return new JAXBElement<NotFoundException>(_NotFoundException_QNAME, NotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcabarJoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "acabarJoc")
    public JAXBElement<AcabarJoc> createAcabarJoc(AcabarJoc value) {
        return new JAXBElement<AcabarJoc>(_AcabarJoc_QNAME, AcabarJoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcabarJocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "acabarJocResponse")
    public JAXBElement<AcabarJocResponse> createAcabarJocResponse(AcabarJocResponse value) {
        return new JAXBElement<AcabarJocResponse>(_AcabarJocResponse_QNAME, AcabarJocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfegirJugador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "afegirJugador")
    public JAXBElement<AfegirJugador> createAfegirJugador(AfegirJugador value) {
        return new JAXBElement<AfegirJugador>(_AfegirJugador_QNAME, AfegirJugador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfegirJugadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "afegirJugadorResponse")
    public JAXBElement<AfegirJugadorResponse> createAfegirJugadorResponse(AfegirJugadorResponse value) {
        return new JAXBElement<AfegirJugadorResponse>(_AfegirJugadorResponse_QNAME, AfegirJugadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstatPartida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "consultarEstatPartida")
    public JAXBElement<ConsultarEstatPartida> createConsultarEstatPartida(ConsultarEstatPartida value) {
        return new JAXBElement<ConsultarEstatPartida>(_ConsultarEstatPartida_QNAME, ConsultarEstatPartida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstatPartidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "consultarEstatPartidaResponse")
    public JAXBElement<ConsultarEstatPartidaResponse> createConsultarEstatPartidaResponse(ConsultarEstatPartidaResponse value) {
        return new JAXBElement<ConsultarEstatPartidaResponse>(_ConsultarEstatPartidaResponse_QNAME, ConsultarEstatPartidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartidas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "getPartidas")
    public JAXBElement<GetPartidas> createGetPartidas(GetPartidas value) {
        return new JAXBElement<GetPartidas>(_GetPartidas_QNAME, GetPartidas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartidasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "getPartidasResponse")
    public JAXBElement<GetPartidasResponse> createGetPartidasResponse(GetPartidasResponse value) {
        return new JAXBElement<GetPartidasResponse>(_GetPartidasResponse_QNAME, GetPartidasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarJoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "iniciarJoc")
    public JAXBElement<IniciarJoc> createIniciarJoc(IniciarJoc value) {
        return new JAXBElement<IniciarJoc>(_IniciarJoc_QNAME, IniciarJoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarJocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "iniciarJocResponse")
    public JAXBElement<IniciarJocResponse> createIniciarJocResponse(IniciarJocResponse value) {
        return new JAXBElement<IniciarJocResponse>(_IniciarJocResponse_QNAME, IniciarJocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoureJugador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "moureJugador")
    public JAXBElement<MoureJugador> createMoureJugador(MoureJugador value) {
        return new JAXBElement<MoureJugador>(_MoureJugador_QNAME, MoureJugador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoureJugadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "moureJugadorResponse")
    public JAXBElement<MoureJugadorResponse> createMoureJugadorResponse(MoureJugadorResponse value) {
        return new JAXBElement<MoureJugadorResponse>(_MoureJugadorResponse_QNAME, MoureJugadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPartidas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "setPartidas")
    public JAXBElement<SetPartidas> createSetPartidas(SetPartidas value) {
        return new JAXBElement<SetPartidas>(_SetPartidas_QNAME, SetPartidas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPartidasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ppt/", name = "setPartidasResponse")
    public JAXBElement<SetPartidasResponse> createSetPartidasResponse(SetPartidasResponse value) {
        return new JAXBElement<SetPartidasResponse>(_SetPartidasResponse_QNAME, SetPartidasResponse.class, null, value);
    }

}
