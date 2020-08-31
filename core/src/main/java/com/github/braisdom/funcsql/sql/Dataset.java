package com.github.braisdom.funcsql.sql;

import java.sql.SQLException;
import java.util.List;

public interface Dataset<T> extends Sqlizable {

    Dataset select(Expression... projections);

    Dataset from(Dataset dataset);

    Dataset where(Expression expression);

    Dataset join(Dataset dataset, Expression onExpression);

    Dataset groupBy(Expression... expressions);

    Dataset having(Expression expression);

    Dataset orderBy(Expression... expressions);

    Dataset limit(int limit);

    Dataset offset(int offset);

    Dataset union(Dataset dataset);

    Dataset unionAll(Dataset dataset);

    List<T> execute() throws SQLFormatException, SQLException;
}