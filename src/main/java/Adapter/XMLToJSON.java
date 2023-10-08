package Adapter;

public class XMLToJSON {
    IXMLData ixmlData;

    XMLToJSON(IXMLData xmlData){
        this.ixmlData = xmlData;
    }

    void convertXMLToJson(){
        ixmlData.readXMLData();
        System.out.println("Write logic here to convert xml to json.");
    }
}
