package me.shouheng.notepal.desktop;

import android.app.PendingIntent;
import android.content.Context;
import android.util.SparseArray;
import android.widget.RemoteViews;

import me.shouheng.notepal.R;
import me.shouheng.utils.stability.L;

public class DesktopShortcutAppWidget extends BaseWidgetProvider {

    @Override
    protected RemoteViews getRemoteViews(
            Context context, int widgetId, boolean isSmall,
            boolean isSingleLine, SparseArray<PendingIntent> map) {
        L.d(isSingleLine + " " + isSmall);
        RemoteViews views;
        views = new RemoteViews(context.getPackageName(), R.layout.widget_layout_small);
        views.setOnClickPendingIntent(R.id.iv_launch_app, map.get(R.id.iv_launch_app));
        return views;
    }
}

