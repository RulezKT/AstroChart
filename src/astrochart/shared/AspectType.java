package astrochart.shared;

public enum AspectType {
	Conjunction('\u260C',   0D, 8D, new double[]{ 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D, 10D }),
	Sextile(    '\u002A',  60D, 4D, new double[]{ 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D, 10D }), //26B9
	Square(     '\u25A1',  90D, 5D, new double[]{ 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D, 10D }),
	Trine(      '\u25B3', 120D, 4D, new double[]{ 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D, 10D }),
	Opposition( '\u260D', 180D, 7D, new double[]{ 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D, 10D });
		
	private final char unicode;
	private final double angle;
	private final double defaultOrb;
	private final double[] orbs;
	
	private AspectType(final char unicode, final double angle, final double defaultOrb, final double[] orbs) {
        this.unicode = unicode;
        this.angle = angle;
        this.defaultOrb = defaultOrb;
        this.orbs = orbs;
    }

	public final char getUnicode() {
    	return unicode;
    }	
	
	public final double getAngle() {
    	return angle;
    }
    
	public final double[] getOrbs() {
    	return orbs;
    }
	
	public final double getDefaultOrb() {
    	return defaultOrb;
    }
	
	public final String toString() {
    	return name();
    }
}
