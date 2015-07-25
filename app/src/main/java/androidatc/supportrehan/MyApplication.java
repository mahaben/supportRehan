package androidatc.supportrehan;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by a on 23/07/2015.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        // Parse.initialize(this, "a8bIY4CUEXV8GV4kJYnAekbiM7RhmuTRfqzqr4cM", "CsVoPpQP5jzfLh73KMEtYvdF7XKnQpMMKealtih5");
        Parse.initialize(this, "BzaLTfd7Z0OVvTOY81G2XwKKautuhib82pGzlBMw", "OyLPEqFsLw5nnx5eZWeXuUOIcH5FvkzBgjUrQyuw");
    }
}
