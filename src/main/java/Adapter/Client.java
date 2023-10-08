package Adapter;

public class Client {
    public static void main(String[] args) {
        IXMLData ixmlData = new XMLSoftware();

        XMLToJSON output = new XMLToJSON(ixmlData);
        output.convertXMLToJson();
    }
}
