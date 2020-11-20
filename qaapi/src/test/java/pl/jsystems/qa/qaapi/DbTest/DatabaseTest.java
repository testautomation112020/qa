package pl.jsystems.qa.qaapi.DbTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pl.jsystems.qa.qadatabase.database.UserDao;
import pl.jsystems.qa.qadatabase.database.model.UserDb;

import static com.google.common.truth.Truth.assertThat;

import java.util.List;

@Tags({@Tag("API"), @Tag("database")})
@DisplayName("Database test.")
public class DatabaseTest {

    @DisplayName("Database get all users.")
    @Test
    public void getAllDatabaseUsers() {

        List<UserDb> userDbs = UserDao.getAllUsers();
        System.out.println(userDbs);

        assertThat(userDbs.get(0).id).isEqualTo(1);
        assertThat(userDbs.get(0).name).isEqualTo("Piotr");
        assertThat(userDbs.get(0).surname).isEqualTo("Kowalski");
    }
}
