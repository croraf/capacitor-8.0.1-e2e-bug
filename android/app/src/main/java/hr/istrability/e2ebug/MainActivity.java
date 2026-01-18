package hr.istrability.e2ebug;

import com.getcapacitor.BridgeActivity;
import androidx.core.view.WindowCompat;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        // registerPlugin(MyCustomPlugin.class);
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false); // false for edge-to-edge
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
