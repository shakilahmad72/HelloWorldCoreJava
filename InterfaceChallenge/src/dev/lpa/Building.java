package dev.lpa;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointerMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointerMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointerMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointerMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointerMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
