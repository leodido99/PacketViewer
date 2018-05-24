package packet;

import java.util.ArrayList;

public class Packet {
    private String packetName;
    private ArrayList<PacketField> packetFields;

    public Packet(String packetName) {
        this.packetName = packetName;
    }

    /**
     * Adds a new field to the packet
     * @param packetField Packet field
     */
    public void addField(PacketField packetField) {
        this.packetFields.add(packetField);
    }

    public String getPacketName() {
        return packetName;
    }

    public void setPacketName(String packetName) {
        this.packetName = packetName;
    }

    public ArrayList<PacketField> getPacketFields() {
        return packetFields;
    }

    public void setPacketFields(ArrayList<PacketField> packetFields) {
        this.packetFields = packetFields;
    }
}
