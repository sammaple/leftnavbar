package yunos.demo;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingPrefsFragement extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}
}
