package com.chatchatabc.parking;

import com.github.database.rider.core.api.dataset.DataSet;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.io.FileOutputStream;

public class DataBaseTest extends DomainBaseTest {

    @Test
    @DataSet(value = "db/datasets/dataset.xml")
    public void testLoadData() {

    }

    @Test
    public void testDTDGeneration(@Autowired DataSource dataSource) throws Exception {
        DatabaseConnection databaseConnection = new DatabaseConnection(dataSource.getConnection());
        final IDataSet dataSet = databaseConnection.createDataSet();
        FlatDtdDataSet.write(dataSet, new FileOutputStream("database.dtd"));
    }
}
