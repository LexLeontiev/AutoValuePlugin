import com.google.auto.value.AutoValue;
import test.Interface1;
import android.os.Parcelable;
import java.util.Map;

@AutoValue
public abstract class BasicTestFile implements Interface1, Parcelable, Map<String, String> {

    <caret>
    public abstract String value();

    public int method1Interface2() {
        return 3;
    }

    public Integer notAbstract() {
        return 0;
    }

}