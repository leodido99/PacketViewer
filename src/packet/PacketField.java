package packet;

public class PacketField {
    String name;
    int bitSize;

    public PacketField(int bitSize) {
        this.bitSize = bitSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }
}
