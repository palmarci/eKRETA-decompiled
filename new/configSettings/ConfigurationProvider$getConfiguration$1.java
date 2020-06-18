package hu.ekreta.ellenorzo.configSettings;

import a.h.a.b.m.c;
import a.h.b.q.a;
import a.h.b.q.f;
import a.h.b.q.g;
import a.h.b.q.i;
import a.h.b.q.m;
import a.h.b.q.o.f;
import a.h.c.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import k.b.c0.e.f.a;
import k.b.v;
import k.b.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "subscriber", "Lio/reactivex/SingleEmitter;", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
public final class ConfigurationProvider$getConfiguration$1<T> implements x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigurationProvider f5298a;

    public ConfigurationProvider$getConfiguration$1(ConfigurationProvider configurationProvider) {
        this.f5298a = configurationProvider;
    }

    public final void a(final v<Configuration> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "subscriber");
        final g a2 = ((m) FirebaseApp.getInstance().a(m.class)).a("firebase");
        Intrinsics.checkExpressionValueIsNotNull(a2, "FirebaseRemoteConfig.getInstance()");
        i.b bVar = new i.b();
        bVar.a(4200);
        i iVar = new i(bVar, (i.a) null);
        Intrinsics.checkExpressionValueIsNotNull(iVar, "FirebaseRemoteConfigSett…\n                .build()");
        h.w.v.a(a2.c, new f(a2, iVar));
        Context context = a2.f2513a;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String str = null;
                String str2 = null;
                String str3 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (str2 == null || str3 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                hashMap.put(str2, str3);
                            }
                            str2 = null;
                            str3 = null;
                        }
                        str = null;
                    } else if (eventType == 4 && str != null) {
                        char c = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721) {
                                if (str.equals("value")) {
                                    c = 1;
                                }
                            }
                        } else if (str.equals("key")) {
                            c = 0;
                        }
                        if (c == 0) {
                            str2 = xml.getText();
                        } else if (c != 1) {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException e) {
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        }
        try {
            f.b a3 = a.h.b.q.o.f.a();
            a3.f2535a = new JSONObject(hashMap);
            a2.f.a(a3.a()).a(a.f2508a);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            h.w.v.c(null);
        }
        a2.a().a(new c<Boolean>(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ConfigurationProvider$getConfiguration$1 f5299a;

            {
                this.f5299a = r1;
            }

            public final void a(a.h.a.b.m.g<Boolean> gVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "task");
                if (gVar.d()) {
                    v vVar = vVar;
                    long a2 = this.f5299a.f5298a.a();
                    String b2 = this.f5299a.f5298a.b();
                    String a3 = a2.a("latestVersion");
                    Intrinsics.checkExpressionValueIsNotNull(a3, "remoteConfig.getString(\"latestVersion\")");
                    int parseInt = Integer.parseInt(a3);
                    String a4 = a2.a("minimumSupportedVersion");
                    Intrinsics.checkExpressionValueIsNotNull(a4, "remoteConfig.getString(\"minimumSupportedVersion\")");
                    int parseInt2 = Integer.parseInt(a4);
                    ConfigurationProvider configurationProvider = this.f5299a.f5298a;
                    String a5 = a2.a("blacklistPlatformByMobileBuildVersion");
                    Intrinsics.checkExpressionValueIsNotNull(a5, "remoteConfig.getString(\"…ormByMobileBuildVersion\")");
                    List access$toAndroidVersionCodes = configurationProvider.a(a5);
                    Object a6 = new l().a().a(a2.a("powerSaverManagerAppsByManufacturer"), PowerSaverManagerAppDetails.Companion.a());
                    Intrinsics.checkExpressionValueIsNotNull(a6, "GsonBuilder().create().f…                        )");
                    ((a.C0123a) vVar).a(new Configuration(parseInt, parseInt2, access$toAndroidVersionCodes, a2, b2, (List) a6));
                    return;
                }
                ((a.C0123a) vVar).a((Throwable) new RuntimeException("Fetching Firebase configuration failed."));
            }
        });
    }
}
