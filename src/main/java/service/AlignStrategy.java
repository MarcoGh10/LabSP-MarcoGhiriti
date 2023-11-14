package service;

import models.Context;
import models.Paragraph;

public interface AlignStrategy {

    String render(Paragraph paragraph, Context context);
}
