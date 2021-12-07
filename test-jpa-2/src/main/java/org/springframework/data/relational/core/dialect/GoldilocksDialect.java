package org.springframework.data.relational.core.dialect;

public class GoldilocksDialect extends AnsiDialect {

    /**
     * Singleton instance.
     */
    public static final GoldilocksDialect INSTANCE = new GoldilocksDialect();

    protected GoldilocksDialect() {}

@Override
public ArrayColumns getArraySupport() {
    return ArrayColumns.Unsupported.INSTANCE;
}
}
