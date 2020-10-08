package net.c306.devshortcut

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.TileService

class DevSettingsTileService : TileService() {
    override fun onClick() {
        super.onClick()
        // Open developer settings on tile click
        val openDevSettingsIntent = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
            .apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) }
        startActivityAndCollapse(openDevSettingsIntent)
    }
}