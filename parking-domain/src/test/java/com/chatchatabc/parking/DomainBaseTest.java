package com.chatchatabc.parking;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.connection.RiderDataSource;
import com.github.database.rider.junit5.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@DBRider
@DBUnit(cacheConnection = false, leakHunter = true, caseSensitiveTableNames = true, expectedDbType = RiderDataSource.DBType.POSTGRESQL)
public abstract class DomainBaseTest {


}
