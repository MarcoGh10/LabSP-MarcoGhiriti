package service;

import models.Context;
import models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public String render(Paragraph paragraph, Context context) {
        return null;
    }

    @Override
    public void setAlignStrategy(AlignCenter alignCenter) {

    }
}
