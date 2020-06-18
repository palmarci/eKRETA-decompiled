package hu.ekreta.ellenorzo.util;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import h.m.d.d;
import h.p.m;
import h.p.r;
import h.w.v;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.notes.Note;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import hu.ekreta.ellenorzo.notification.NotificationMessageType;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.subject.detail.SubjectParameters;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k.b.a0.c;
import k.b.b0.i;
import k.b.c0.b.b;
import k.b.c0.e.c.g;
import k.b.c0.e.e.h;
import k.b.j;
import k.b.n;
import k.b.z.a.a;
import k.c.f0;
import k.c.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0007\u0012\u0005\u0018\u00010\u00010\u00012\f\b\u0002\u0010 \u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010¡\u0001\u001a)\u0010¢\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010£\u0001\u001a_\u0010¤\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00180\u0001\"\u0006\b\u0000\u0010\u0018\u0018\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u0001H\u00182)\b\u0004\u0010¥\u0001\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002H\u0018\u0012\u0005\u0012\u00030§\u00010¦\u0001¢\u0006\u0003\b¨\u0001H\b¢\u0006\u0003\u0010©\u0001\u001a)\u0010ª\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001000\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u000100¢\u0006\u0003\u0010«\u0001\u001a9\u0010¬\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00180\u0001\"\u000b\b\u0000\u0010\u0018\u0018\u0001*\u00030­\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u0001H\u0018H\b¢\u0006\u0003\u0010®\u0001\u001a?\u0010¯\u0001\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0018\u0018\u00010g0\u0001\"\u000b\b\u0000\u0010\u0018\u0018\u0001*\u00030­\u00012\u0011\b\u0002\u0010 \u0001\u001a\n\u0012\u0004\u0012\u0002H\u0018\u0018\u00010gH\b\u001a\u001b\u0010°\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010²\u0001\u001a\u001a\u0010³\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010´\u0001\u001a9\u0010µ\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00180\u0001\"\u000b\b\u0000\u0010\u0018\u0018\u0001*\u00030¶\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u0001H\u0018H\b¢\u0006\u0003\u0010·\u0001\u001aJ\u0010¸\u0001\u001a\u00030¹\u00012\t\b\u0002\u0010º\u0001\u001a\u00020\u00012\t\b\u0002\u0010»\u0001\u001a\u00020\u00012\t\b\u0002\u0010¼\u0001\u001a\u00020\u00012\t\b\u0002\u0010½\u0001\u001a\u00020\u00012\t\b\u0002\u0010¾\u0001\u001a\u00020\u00012\t\b\u0002\u0010¿\u0001\u001a\u00020\u0001\u001a#\u0010À\u0001\u001a\u0011\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010>0\u00012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u00010>\u001a\u0011\u0010Á\u0001\u001a\u00020\u00012\b\u0010Â\u0001\u001a\u00030\u0001\u001a\u0019\u0010Ã\u0001\u001a\u00020\u00012\n\u0010Â\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010Ä\u0001\u001a.\u0010Å\u0001\u001a\u00030§\u0001\"\u0004\b\u0000\u0010\u0018*\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180g0Æ\u00012\r\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u0002H\u00180g\u001a\f\u0010È\u0001\u001a\u00020>*\u00030É\u0001\u001a.\u0010Ê\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ë\u0001\u0012\u0005\u0012\u00030\u00010\u0001*\u00030Ì\u00012\u0007\u0010Í\u0001\u001a\u00020>2\b\u0010 \u0001\u001a\u00030\u0001\u001a)\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u0003HÏ\u00010g\"\u0005\b\u0000\u0010Ï\u0001*\f\u0012\u0007\u0012\u0005\u0018\u00010Ë\u00010Ð\u0001¢\u0006\u0003\u0010Ñ\u0001\u001a\u0017\u0010Ò\u0001\u001a\u00030\u0001*\u00030Ó\u00012\b\u0010Ô\u0001\u001a\u00030Õ\u0001\u001a3\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u0003HØ\u00010×\u0001\"\u0005\b\u0000\u0010Ø\u0001*\u00030Ù\u00012\u0016\u0010Ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ü\u0001\u0012\u0005\u0012\u0003HØ\u00010Û\u0001\u001aJ\u0010Ý\u0001\u001a,\u0012\u000e\u0012\f G*\u0005\u0018\u0001HÞ\u0001HÞ\u0001 G*\u0015\u0012\u000e\u0012\f G*\u0005\u0018\u0001HÞ\u0001HÞ\u0001\u0018\u00010×\u00010×\u0001\"\u0005\b\u0000\u0010Þ\u0001*\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003HÞ\u00010g0×\u0001\u001a\u0016\u0010ß\u0001\u001a\u00020>*\u00030à\u00012\b\u0010á\u0001\u001a\u00030â\u0001\u001a\u0015\u0010ã\u0001\u001a\u00020H*\u00020\u00012\b\u0010ä\u0001\u001a\u00030å\u0001\u001a&\u0010æ\u0001\u001a\u0002H\u0018\"\t\b\u0000\u0010\u0018*\u00030ç\u0001*\u00020\u00012\b\u0010ä\u0001\u001a\u00030å\u0001¢\u0006\u0003\u0010è\u0001\u001a\r\u0010é\u0001\u001a\u00030§\u0001*\u00030ê\u0001\u001aH\u0010ë\u0001\u001a\u00030§\u0001*\u00030ì\u00012(\u0010í\u0001\u001a#\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030ï\u0001\u0012\u0005\u0012\u00030§\u00010Û\u0001j\u0003`ð\u0001¢\u0006\u0003\b¨\u00010î\u00012\u000f\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030ï\u00010ò\u0001\u001a\u0014\u0010ó\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010×\u0001*\u00030ô\u0001\u001a.\u0010õ\u0001\u001a\u0004\u0018\u0001H\u0018\"\u000b\b\u0000\u0010\u0018\u0018\u0001*\u00030Ë\u0001*\u0002H\u00182\t\u0010ö\u0001\u001a\u0004\u0018\u0001H\u0018H\f¢\u0006\u0003\u0010÷\u0001\u001a\u001a\u0010ø\u0001\u001a\u00030ù\u0001*\u00030¹\u00012\b\u0010ö\u0001\u001a\u00030¹\u0001H\u0002\u001a\u0018\u0010ú\u0001\u001a\u00030§\u0001*\u00030û\u00012\t\u0010ü\u0001\u001a\u0004\u0018\u00010>\u001a\u0018\u0010ý\u0001\u001a\u00030§\u0001*\u00030û\u00012\t\u0010ü\u0001\u001a\u0004\u0018\u00010>\u001ah\u0010þ\u0001\u001a\u00030§\u0001\"\u0005\b\u0000\u0010ÿ\u0001\"\u0013\b\u0001\u0010\u0002*\f\u0012\u0007\b\u0000\u0012\u0003Hÿ\u00010\u0002*\u00030\u00022\b\u0010\u0002\u001a\u00030ì\u00012\u0015\u0010\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003Hÿ\u00010g0î\u00012\u001c\u0010\u0002\u001a\u0017\u0012\u0005\u0012\u00030å\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u0003H\u00020\u0002\u001ab\u0010þ\u0001\u001a\u00030§\u0001\"\u0005\b\u0000\u0010ÿ\u0001\"\u0013\b\u0001\u0010\u0002*\f\u0012\u0007\b\u0000\u0012\u0003Hÿ\u00010\u0002*\u00030\u00022\b\u0010\u0002\u001a\u00030ì\u00012\u0015\u0010\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003Hÿ\u00010g0î\u00012\u0016\u0010\u0002\u001a\u0011\u0012\u0005\u0012\u0003Hÿ\u0001\u0012\u0005\u0012\u0003H\u00020\u0002\u001a*\u0010þ\u0001\u001a\u00030§\u0001\"\n\b\u0000\u0010\u0002*\u00030\u0002*\u00030\u00022\u000f\u0010\u0002\u001a\n\u0012\u0005\u0012\u0003H\u00020\u0002\u001aW\u0010þ\u0001\u001a\u00030§\u0001\"\u0005\b\u0000\u0010ÿ\u0001\"\u0013\b\u0001\u0010\u0002*\f\u0012\u0007\b\u0000\u0012\u0003Hÿ\u00010\u0002*\u00030\u00022\u000e\u0010\u0002\u001a\t\u0012\u0005\u0012\u0003Hÿ\u00010g2\u001c\u0010\u0002\u001a\u0017\u0012\u0005\u0012\u00030å\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u0003H\u00020\u0002\u001aF\u0010\u0002\u001a\t\u0012\u0005\u0012\u0003H\u00020g\"\u0005\b\u0000\u0010\u0002*\n\u0012\u0005\u0012\u0003H\u00020\u00022\u0015\u0010\u0002\u001a\u0010\u0012\u0005\u0012\u0003H\u0002\u0012\u0004\u0012\u00020>0\u00022\f\b\u0002\u0010\u0002\u001a\u0005\u0018\u00010\u0002\u001a0\u0010\u0002\u001a\u0012\u0012\u0005\u0012\u00030Ë\u0001\u0012\u0006\u0012\u0004\u0018\u00010>0\u0001*\u00030Ì\u00012\u0007\u0010Í\u0001\u001a\u00020>2\t\u0010 \u0001\u001a\u0004\u0018\u00010>\u001a\u000b\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0016\u0010\u0002\u001a\f G*\u0005\u0018\u00010\u00020\u0002*\u00030\u0002\u001a9\u0010\u0002\u001a\u00030§\u0001\"\u0004\b\u0000\u0010\u0018*\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180g0Æ\u00012\u0007\u0010\u0002\u001a\u0002H\u00182\t\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0003\u0010\u0002\u001a\u0016\u0010\u0002\u001a\u00020>*\u00020>2\t\b\u0002\u0010\u0002\u001a\u00020>\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"3\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"3\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"#\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u0018*\u0004\u0018\u0001H\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"3\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b8F@FX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \"3\u0010#\u001a\u0004\u0018\u00010\"*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\"8F@FX\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"3\u0010*\u001a\u0004\u0018\u00010)*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010)8F@FX\u0002¢\u0006\u0012\n\u0004\b/\u0010\u000e\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"3\u00101\u001a\u0004\u0018\u000100*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u0001008F@FX\u0002¢\u0006\u0012\n\u0004\b6\u0010\u000e\u001a\u0004\b2\u00103\"\u0004\b4\u00105\"3\u00108\u001a\u0004\u0018\u000107*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u0001078F@FX\u0002¢\u0006\u0012\n\u0004\b=\u0010\u000e\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\"3\u0010?\u001a\u0004\u0018\u00010>*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010>8F@FX\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000e\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C\"\u001d\u0010E\u001a\n G*\u0004\u0018\u00010F0F*\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J\"3\u0010L\u001a\u0004\u0018\u00010K*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010K8F@FX\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u000e\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\"3\u0010S\u001a\u0004\u0018\u00010R*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010R8F@FX\u0002¢\u0006\u0012\n\u0004\bX\u0010\u000e\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W\"3\u0010Z\u001a\u0004\u0018\u00010Y*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010Y8F@FX\u0002¢\u0006\u0012\n\u0004\b_\u0010\u000e\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\"3\u0010a\u001a\u0004\u0018\u00010`*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010`8F@FX\u0002¢\u0006\u0012\n\u0004\bf\u0010\u000e\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\"?\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010g*\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010g8F@FX\u0002¢\u0006\u0012\n\u0004\bn\u0010\u000e\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m\"3\u0010o\u001a\u0004\u0018\u00010h*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010h8F@FX\u0002¢\u0006\u0012\n\u0004\bt\u0010\u000e\u001a\u0004\bp\u0010q\"\u0004\br\u0010s\"\u0017\u0010u\u001a\u00020>*\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\bv\u0010w\"\u0017\u0010x\u001a\u00020>*\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\by\u0010w\"3\u0010z\u001a\u0004\u0018\u00010>*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010>8F@FX\u0002¢\u0006\u0012\n\u0004\b}\u0010\u000e\u001a\u0004\b{\u0010A\"\u0004\b|\u0010C\"8\u0010\u001a\u0004\u0018\u00010~*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010~8F@FX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010\u000e\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\";\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u00020\b2\t\u0010\u0005\u001a\u0005\u0018\u00010\u00018F@FX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010\u000e\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\";\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u00020\b2\t\u0010\u0005\u001a\u0005\u0018\u00010\u00018F@FX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010\u000e\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\";\u0010\u0001\u001a\u0005\u0018\u00010\u0001*\u00020\b2\t\u0010\u0005\u001a\u0005\u0018\u00010\u00018F@FX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010\u000e\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\"7\u0010\u0001\u001a\u0004\u0018\u00010>*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010>8F@FX\u0002¢\u0006\u0015\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010A\"\u0005\b\u0001\u0010C¨\u0006\u0002"}, d2 = {"booleanFalseValue", "", "booleanNullValue", "booleanTrueValue", "intNullValue", "<set-?>", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "addressee", "Landroid/content/Intent;", "getAddressee", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "setAddressee", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/newmessage/model/Addressee;)V", "addressee$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "announcedTestObject", "getAnnouncedTestObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "setAnnouncedTestObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "announcedTestObject$delegate", "asMaybe", "Lio/reactivex/Maybe;", "T", "getAsMaybe", "(Ljava/lang/Object;)Lio/reactivex/Maybe;", "Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "caseDetailParameter", "getCaseDetailParameter", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "setCaseDetailParameter", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;)V", "caseDetailParameter$delegate", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "caseObject", "getCaseObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/BaseCase;", "setCaseObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "caseObject$delegate", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "evaluationObject", "getEvaluationObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "setEvaluationObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "evaluationObject$delegate", "", "homeworkId", "getHomeworkId", "(Landroid/content/Intent;)Ljava/lang/Long;", "setHomeworkId", "(Landroid/content/Intent;Ljava/lang/Long;)V", "homeworkId$delegate", "Lhu/ekreta/ellenorzo/homework/Homework;", "homeworkObject", "getHomeworkObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/homework/Homework;", "setHomeworkObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/homework/Homework;)V", "homeworkObject$delegate", "", "instituteCode", "getInstituteCode", "(Landroid/content/Intent;)Ljava/lang/String;", "setInstituteCode", "(Landroid/content/Intent;Ljava/lang/String;)V", "instituteCode$delegate", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "getLayoutInflater", "(Landroid/view/View;)Landroid/view/LayoutInflater;", "Lhu/ekreta/ellenorzo/message/Message;", "messageObject", "getMessageObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/message/Message;", "setMessageObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/message/Message;)V", "messageObject$delegate", "Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "messageTypeObject", "getMessageTypeObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notification/NotificationMessageType;", "setMessageTypeObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/notification/NotificationMessageType;)V", "messageTypeObject$delegate", "Lhu/ekreta/ellenorzo/notes/Note;", "noteObject", "getNoteObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notes/Note;", "setNoteObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/notes/Note;)V", "noteObject$delegate", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "noticeBoardItemObject", "getNoticeBoardItemObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "setNoticeBoardItemObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "noticeBoardItemObject$delegate", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "omissionList", "getOmissionList", "(Landroid/content/Intent;)Ljava/util/List;", "setOmissionList", "(Landroid/content/Intent;Ljava/util/List;)V", "omissionList$delegate", "omissionObject", "getOmissionObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/omission/Omission;", "setOmissionObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/omission/Omission;)V", "omissionObject$delegate", "orDefault", "getOrDefault", "(Ljava/lang/String;)Ljava/lang/String;", "orHyphen", "getOrHyphen", "profileId", "getProfileId", "setProfileId", "profileId$delegate", "Lhu/ekreta/ellenorzo/profile/Profile;", "profileObject", "getProfileObject", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/profile/Profile;", "setProfileObject", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/profile/Profile;)V", "profileObject$delegate", "", "showReplyMenu", "getShowReplyMenu", "(Landroid/content/Intent;)Ljava/lang/Boolean;", "setShowReplyMenu", "(Landroid/content/Intent;Ljava/lang/Boolean;)V", "showReplyMenu$delegate", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "subjectParameters", "getSubjectParameters", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "subjectParameters$delegate", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "timeTableItemDetailParameter", "getTimeTableItemDetailParameter", "(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setTimeTableItemDetailParameter", "(Landroid/content/Intent;Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "timeTableItemDetailParameter$delegate", "timeTableItemUid", "getTimeTableItemUid", "setTimeTableItemUid", "timeTableItemUid$delegate", "booleanIntentExtraAsProperty", "Lkotlin/properties/ReadWriteProperty;", "defaultValue", "(Ljava/lang/Boolean;)Lkotlin/properties/ReadWriteProperty;", "intIntentExtraAsProperty", "(Ljava/lang/Integer;)Lkotlin/properties/ReadWriteProperty;", "intentExtraAsProperty", "put", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "longIntentExtraAsProperty", "(Ljava/lang/Long;)Lkotlin/properties/ReadWriteProperty;", "parcelableIntentExtraAsProperty", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)Lkotlin/properties/ReadWriteProperty;", "parcelableListIntentExtraAsProperty", "readNullableParcelableIntToBoolean", "value", "(Ljava/lang/Integer;)Ljava/lang/Boolean;", "readNullableParcelableIntToInt", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "serializableIntentExtraAsProperty", "Ljava/io/Serializable;", "(Ljava/io/Serializable;)Lkotlin/properties/ReadWriteProperty;", "setTimeInCalendar", "Ljava/util/Calendar;", "year", "month", "day", "hourOfDay", "minute", "second", "stringIntentExtraAsProperty", "writeBoolToParcel", "enabled", "writeNullableBoolToParcel", "(Ljava/lang/Boolean;)I", "addAll", "Landroidx/lifecycle/MutableLiveData;", "newValues", "asString", "Lorg/threeten/bp/LocalDate;", "booleanPref", "", "Landroid/content/SharedPreferences;", "key", "cast", "TItemType", "", "([Ljava/lang/Object;)Ljava/util/List;", "disposeBy", "Lio/reactivex/disposables/Disposable;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "executeTransaction", "Lio/reactivex/Observable;", "R", "Lio/realm/RealmModel;", "transaction", "Lkotlin/Function1;", "Lio/realm/Realm;", "firstOrEmpty", "TModel", "getFileName", "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "inflate", "root", "Landroid/view/ViewGroup;", "inflateBinding", "Landroidx/databinding/ViewDataBinding;", "(ILandroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "markRequired", "Lcom/google/android/material/textfield/TextInputLayout;", "observeAndRunUiCommands", "Landroidx/lifecycle/LifecycleOwner;", "commands", "Landroidx/lifecycle/LiveData;", "Landroidx/fragment/app/FragmentActivity;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "getActivity", "Lkotlin/Function0;", "observeInternetConnectivity", "Landroid/content/Context;", "overrideWith", "other", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rangeTo", "Lhu/ekreta/ellenorzo/util/CalendarProgression;", "setHtmlOrHide", "Landroid/widget/TextView;", "text", "setTextOrHide", "setup", "ItemViewModel", "ViewHolder", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "lifecycleOwner", "items", "viewHolderFactory", "Lkotlin/Function2;", "adapter", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "sortByProperty", "E", "", "property", "Lkotlin/reflect/KProperty1;", "locale", "Ljava/util/Locale;", "stringPref", "toPx", "trustAllCertificates", "Lokhttp3/OkHttpClient$Builder;", "update", "newValue", "updateIndex", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;Ljava/lang/Integer;)V", "urlEncoded", "encoder", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6270a;
    public static final ReadWriteProperty b = stringIntentExtraAsProperty$default((String) null, 1, (Object) null);
    public static final ReadWriteProperty c = longIntentExtraAsProperty$default((Long) null, 1, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final ReadWriteProperty f6271d = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$1((Object) null);
    public static final ReadWriteProperty e = stringIntentExtraAsProperty$default((String) null, 1, (Object) null);
    public static final ReadWriteProperty f = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$2((Object) null);

    /* renamed from: g  reason: collision with root package name */
    public static final ReadWriteProperty f6272g = stringIntentExtraAsProperty$default((String) null, 1, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public static final ReadWriteProperty f6273h = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$3((Object) null);

    /* renamed from: i  reason: collision with root package name */
    public static final ReadWriteProperty f6274i = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$4((Object) null);

    /* renamed from: j  reason: collision with root package name */
    public static final ReadWriteProperty f6275j = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$5((Object) null);

    /* renamed from: k  reason: collision with root package name */
    public static final ReadWriteProperty f6276k = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$6((Object) null);

    /* renamed from: l  reason: collision with root package name */
    public static final ReadWriteProperty f6277l = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$7((Object) null);

    /* renamed from: m  reason: collision with root package name */
    public static final ReadWriteProperty f6278m = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$8((Object) null);

    /* renamed from: n  reason: collision with root package name */
    public static final ReadWriteProperty f6279n = new ExtensionsKt$$special$$inlined$serializableIntentExtraAsProperty$1((Object) null);

    /* renamed from: o  reason: collision with root package name */
    public static final ReadWriteProperty f6280o = new ExtensionsKt$parcelableListIntentExtraAsProperty$$inlined$intentExtraAsProperty$3((Object) null);

    /* renamed from: p  reason: collision with root package name */
    public static final ReadWriteProperty f6281p = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$9((Object) null);

    /* renamed from: q  reason: collision with root package name */
    public static final ReadWriteProperty f6282q = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$10((Object) null);
    public static final ReadWriteProperty r = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$11((Object) null);
    public static final ReadWriteProperty s = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$12((Object) null);
    public static final ReadWriteProperty t = new ExtensionsKt$$special$$inlined$parcelableIntentExtraAsProperty$13((Object) null);
    public static final ReadWriteProperty u = booleanIntentExtraAsProperty$default((Boolean) null, 1, (Object) null);

    static {
        Class<ExtensionsKt> cls = ExtensionsKt.class;
        f6270a = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "instituteCode", "getInstituteCode(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "homeworkId", "getHomeworkId(Landroid/content/Intent;)Ljava/lang/Long;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "homeworkObject", "getHomeworkObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/homework/Homework;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "timeTableItemUid", "getTimeTableItemUid(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "announcedTestObject", "getAnnouncedTestObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "profileId", "getProfileId(Landroid/content/Intent;)Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "messageObject", "getMessageObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/message/Message;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "timeTableItemDetailParameter", "getTimeTableItemDetailParameter(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/timetable/TimeTableItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "evaluationObject", "getEvaluationObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/evaluation/Evaluation;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "noteObject", "getNoteObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notes/Note;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "noticeBoardItemObject", "getNoticeBoardItemObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "profileObject", "getProfileObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/profile/Profile;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "messageTypeObject", "getMessageTypeObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/notification/NotificationMessageType;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "omissionList", "getOmissionList(Landroid/content/Intent;)Ljava/util/List;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "omissionObject", "getOmissionObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/omission/Omission;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "subjectParameters", "getSubjectParameters(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "caseObject", "getCaseObject(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/BaseCase;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "caseDetailParameter", "getCaseDetailParameter(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "addressee", "getAddressee(Landroid/content/Intent;)Lhu/ekreta/ellenorzo/newmessage/model/Addressee;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(cls, "app_guardianProdRelease"), "showReplyMenu", "getShowReplyMenu(Landroid/content/Intent;)Ljava/lang/Boolean;"))};
    }

    public static final Addressee a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$addressee");
        return (Addressee) t.getValue(intent, f6270a[18]);
    }

    public static final String a(String str) {
        return str != null ? str : "-";
    }

    public static final void a(Intent intent, AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$announcedTestObject");
        f.setValue(intent, f6270a[4], announcedTest);
    }

    public static final void a(Intent intent, BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseObject");
        r.setValue(intent, f6270a[16], baseCase);
    }

    public static final void a(Intent intent, CaseDetailParameter caseDetailParameter) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseDetailParameter");
        s.setValue(intent, f6270a[17], caseDetailParameter);
    }

    public static final void a(Intent intent, Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$evaluationObject");
        f6275j.setValue(intent, f6270a[8], evaluation);
    }

    public static final void a(Intent intent, Homework homework) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkObject");
        f6271d.setValue(intent, f6270a[2], homework);
    }

    public static final void a(Intent intent, Message message) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageObject");
        f6273h.setValue(intent, f6270a[6], message);
    }

    public static final void a(Intent intent, Addressee addressee) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$addressee");
        t.setValue(intent, f6270a[18], addressee);
    }

    public static final void a(Intent intent, Note note) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noteObject");
        f6276k.setValue(intent, f6270a[9], note);
    }

    public static final void a(Intent intent, NoticeBoardItem noticeBoardItem) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noticeBoardItemObject");
        f6277l.setValue(intent, f6270a[10], noticeBoardItem);
    }

    public static final void a(Intent intent, Omission omission) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionObject");
        f6281p.setValue(intent, f6270a[14], omission);
    }

    public static final void a(Intent intent, Profile profile) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileObject");
        f6278m.setValue(intent, f6270a[11], profile);
    }

    public static final void a(Intent intent, SubjectParameters subjectParameters) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$subjectParameters");
        f6282q.setValue(intent, f6270a[15], subjectParameters);
    }

    public static final void a(Intent intent, TimeTableItem timeTableItem) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemDetailParameter");
        f6274i.setValue(intent, f6270a[7], timeTableItem);
    }

    public static final void a(Intent intent, Long l2) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkId");
        c.setValue(intent, f6270a[1], l2);
    }

    public static final void a(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$instituteCode");
        b.setValue(intent, f6270a[0], str);
    }

    public static final void a(Intent intent, List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionList");
        f6280o.setValue(intent, f6270a[13], list);
    }

    public static final void a(m mVar, LiveData<Function1<d, Unit>> liveData, Function0<? extends d> function0) {
        Intrinsics.checkParameterIsNotNull(mVar, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        Intrinsics.checkParameterIsNotNull(function0, "getActivity");
        liveData.a(mVar, new ExtensionsKt$observeAndRunUiCommands$1(function0));
    }

    public static final AnnouncedTest b(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$announcedTestObject");
        return (AnnouncedTest) f.getValue(intent, f6270a[4]);
    }

    public static final String b(String str) {
        return str == null || str.length() == 0 ? "-" : str;
    }

    public static final void b(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileId");
        f6272g.setValue(intent, f6270a[5], str);
    }

    public static /* synthetic */ ReadWriteProperty booleanIntentExtraAsProperty$default(Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        return new ExtensionsKt$booleanIntentExtraAsProperty$$inlined$intentExtraAsProperty$1(bool);
    }

    public static final CaseDetailParameter c(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseDetailParameter");
        return (CaseDetailParameter) s.getValue(intent, f6270a[17]);
    }

    public static final void c(Intent intent, String str) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemUid");
        e.setValue(intent, f6270a[3], str);
    }

    public static final BaseCase d(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$caseObject");
        return (BaseCase) r.getValue(intent, f6270a[16]);
    }

    public static final Evaluation e(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$evaluationObject");
        return (Evaluation) f6275j.getValue(intent, f6270a[8]);
    }

    public static final Long f(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkId");
        return (Long) c.getValue(intent, f6270a[1]);
    }

    public static final Homework g(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$homeworkObject");
        return (Homework) f6271d.getValue(intent, f6270a[2]);
    }

    public static final String h(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$instituteCode");
        return (String) b.getValue(intent, f6270a[0]);
    }

    public static final Message i(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageObject");
        return (Message) f6273h.getValue(intent, f6270a[6]);
    }

    public static /* synthetic */ ReadWriteProperty intIntentExtraAsProperty$default(Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        return new ExtensionsKt$intIntentExtraAsProperty$$inlined$intentExtraAsProperty$1(num);
    }

    public static final /* synthetic */ <T> ReadWriteProperty<Intent, T> intentExtraAsProperty(T t2, Function3<? super Intent, ? super String, ? super T, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(function3, "put");
        Intrinsics.needClassReification();
        return new ExtensionsKt$intentExtraAsProperty$1(t2, function3);
    }

    public static /* synthetic */ ReadWriteProperty intentExtraAsProperty$default(Object obj, Function3 function3, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        Intrinsics.checkParameterIsNotNull(function3, "put");
        Intrinsics.needClassReification();
        return new ExtensionsKt$intentExtraAsProperty$1(obj, function3);
    }

    public static final NotificationMessageType j(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$messageTypeObject");
        return (NotificationMessageType) f6279n.getValue(intent, f6270a[12]);
    }

    public static final Note k(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noteObject");
        return (Note) f6276k.getValue(intent, f6270a[9]);
    }

    public static final NoticeBoardItem l(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$noticeBoardItemObject");
        return (NoticeBoardItem) f6277l.getValue(intent, f6270a[10]);
    }

    public static /* synthetic */ ReadWriteProperty longIntentExtraAsProperty$default(Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = null;
        }
        return new ExtensionsKt$longIntentExtraAsProperty$$inlined$intentExtraAsProperty$1(l2);
    }

    public static final List<Omission> m(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionList");
        return (List) f6280o.getValue(intent, f6270a[13]);
    }

    public static final Omission n(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$omissionObject");
        return (Omission) f6281p.getValue(intent, f6270a[14]);
    }

    public static final String o(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileId");
        return (String) f6272g.getValue(intent, f6270a[5]);
    }

    public static final /* synthetic */ <T> T overrideWith(T t2, T t3) {
        Class<Object> cls = Object.class;
        Intrinsics.checkParameterIsNotNull(t2, "$this$overrideWith");
        if (t3 == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        Collection declaredMemberProperties = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(cls));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(declaredMemberProperties, 10)), 16));
        for (Object next : declaredMemberProperties) {
            linkedHashMap.put(((KProperty1) next).getName(), next);
        }
        Intrinsics.reifiedOperationMarker(4, "T");
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(Reflection.getOrCreateKotlinClass(cls));
        if (primaryConstructor == null) {
            Intrinsics.throwNpe();
        }
        List<KParameter> parameters = primaryConstructor.getParameters();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10)), 16));
        for (KParameter kParameter : parameters) {
            Object obj = linkedHashMap.get(kParameter.getName());
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            KProperty1 kProperty1 = (KProperty1) obj;
            Object obj2 = kProperty1.get(t3);
            if (obj2 == null) {
                obj2 = kProperty1.get(t2);
            }
            Pair pair = TuplesKt.to(kParameter, obj2);
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        return primaryConstructor.callBy(linkedHashMap2);
    }

    public static final Profile p(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$profileObject");
        return (Profile) f6278m.getValue(intent, f6270a[11]);
    }

    public static /* synthetic */ ReadWriteProperty parcelableIntentExtraAsProperty$default(Parcelable parcelable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            parcelable = null;
        }
        Intrinsics.needClassReification();
        return new ExtensionsKt$parcelableIntentExtraAsProperty$$inlined$intentExtraAsProperty$2(parcelable);
    }

    public static final /* synthetic */ <T extends Parcelable> ReadWriteProperty<Intent, List<T>> parcelableListIntentExtraAsProperty(List<? extends T> list) {
        return new ExtensionsKt$parcelableListIntentExtraAsProperty$$inlined$intentExtraAsProperty$1(list);
    }

    public static /* synthetic */ ReadWriteProperty parcelableListIntentExtraAsProperty$default(List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = null;
        }
        return new ExtensionsKt$parcelableListIntentExtraAsProperty$$inlined$intentExtraAsProperty$2(list);
    }

    public static final Boolean q(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$showReplyMenu");
        return (Boolean) u.getValue(intent, f6270a[19]);
    }

    public static final SubjectParameters r(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$subjectParameters");
        return (SubjectParameters) f6282q.getValue(intent, f6270a[15]);
    }

    public static final TimeTableItem s(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$timeTableItemDetailParameter");
        return (TimeTableItem) f6274i.getValue(intent, f6270a[7]);
    }

    public static /* synthetic */ ReadWriteProperty serializableIntentExtraAsProperty$default(Serializable serializable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            serializable = null;
        }
        Intrinsics.needClassReification();
        return new ExtensionsKt$serializableIntentExtraAsProperty$$inlined$intentExtraAsProperty$2(serializable);
    }

    public static /* synthetic */ Calendar setTimeInCalendar$default(int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i2 = 2019;
        }
        if ((i8 & 2) != 0) {
            i3 = 12;
        }
        if ((i8 & 4) != 0) {
            i4 = 24;
        }
        if ((i8 & 8) != 0) {
            i5 = 0;
        }
        if ((i8 & 16) != 0) {
            i6 = 0;
        }
        if ((i8 & 32) != 0) {
            i7 = 0;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(1, i2);
        instance.set(2, i3);
        instance.set(5, i4);
        instance.set(11, i5);
        instance.set(12, i6);
        instance.set(13, i7);
        instance.set(14, 0);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance;
    }

    public static /* synthetic */ List sortByProperty$default(Iterable iterable, KProperty1 kProperty1, Locale locale, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            locale = Locale.getDefault();
        }
        Intrinsics.checkParameterIsNotNull(iterable, "$this$sortByProperty");
        Intrinsics.checkParameterIsNotNull(kProperty1, "property");
        return CollectionsKt___CollectionsKt.sortedWith(iterable, new ExtensionsKt$sortByProperty$1(locale, kProperty1));
    }

    public static /* synthetic */ ReadWriteProperty stringIntentExtraAsProperty$default(String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return new ExtensionsKt$stringIntentExtraAsProperty$$inlined$intentExtraAsProperty$1(str);
    }

    public static /* synthetic */ String urlEncoded$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "UTF-8";
        }
        Intrinsics.checkParameterIsNotNull(str, "$this$urlEncoded");
        Intrinsics.checkParameterIsNotNull(str2, "encoder");
        String encode = URLEncoder.encode(str, str2);
        Intrinsics.checkExpressionValueIsNotNull(encode, "URLEncoder.encode(this, encoder)");
        return encode;
    }

    public static final LayoutInflater a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$layoutInflater");
        return LayoutInflater.from(view.getContext());
    }

    public static final void b(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setTextOrHide");
        int i2 = 0;
        if (!(str == null || str.length() == 0)) {
            textView.setText(str);
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public static final ReadWriteProperty<Object, Boolean> a(SharedPreferences sharedPreferences, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "$this$booleanPref");
        Intrinsics.checkParameterIsNotNull(str, "key");
        return new ExtensionsKt$booleanPref$1(sharedPreferences, str, z);
    }

    public static final ReadWriteProperty<Object, String> a(SharedPreferences sharedPreferences, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "$this$stringPref");
        Intrinsics.checkParameterIsNotNull(str, "key");
        return new ExtensionsKt$stringPref$1(sharedPreferences, str, str2);
    }

    public static final <R> n<R> a(f0 f0Var, Function1<? super y, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(f0Var, "$this$executeTransaction");
        Intrinsics.checkParameterIsNotNull(function1, "transaction");
        ExtensionsKt$executeTransaction$1 extensionsKt$executeTransaction$1 = new ExtensionsKt$executeTransaction$1(f0Var, function1);
        b.a(extensionsKt$executeTransaction$1, "source is null");
        n<R> b2 = k.b.a0.d.a(new h(extensionsKt$executeTransaction$1)).b(a.a());
        Intrinsics.checkExpressionValueIsNotNull(b2, "Observable.create { emit…dSchedulers.mainThread())");
        return b2;
    }

    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void a(RecyclerView recyclerView, m mVar, LiveData<List<ItemViewModel>> liveData, Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder> function2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "items");
        Intrinsics.checkParameterIsNotNull(function2, "viewHolderFactory");
        a(recyclerView, mVar, liveData, new MVVMRecyclerViewAdapter(function2));
    }

    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void a(RecyclerView recyclerView, m mVar, LiveData<List<ItemViewModel>> liveData, MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder> mVVMRecyclerViewAdapter) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(mVar, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(liveData, "items");
        Intrinsics.checkParameterIsNotNull(mVVMRecyclerViewAdapter, "adapter");
        liveData.a(mVar, mVVMRecyclerViewAdapter);
        a(recyclerView, mVVMRecyclerViewAdapter);
    }

    public static final <ItemViewModel, ViewHolder extends MVVMViewHolder<? super ItemViewModel>> void a(RecyclerView recyclerView, List<? extends ItemViewModel> list, Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder> function2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(list, "items");
        Intrinsics.checkParameterIsNotNull(function2, "viewHolderFactory");
        MVVMRecyclerViewAdapter mVVMRecyclerViewAdapter = new MVVMRecyclerViewAdapter(function2);
        a(recyclerView, mVVMRecyclerViewAdapter);
        mVVMRecyclerViewAdapter.onChanged(list);
    }

    public static final <ViewHolder extends RecyclerView.d0> void a(RecyclerView recyclerView, RecyclerView.g<ViewHolder> gVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$setup");
        Intrinsics.checkParameterIsNotNull(gVar, "adapter");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(gVar);
    }

    public static final CalendarProgression a(Calendar calendar, Calendar calendar2) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$rangeTo");
        Intrinsics.checkParameterIsNotNull(calendar2, "other");
        return new CalendarProgression(calendar, calendar2, 0, 4, (DefaultConstructorMarker) null);
    }

    public static final int a(int i2) {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) (((float) i2) * system.getDisplayMetrics().density);
    }

    public static final String a(o.c.a.d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$asString");
        List listOf = CollectionsKt__CollectionsKt.listOf("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        o.c.a.p.a a2 = o.c.a.p.a.a("yyyy. LLLL d.");
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.a(a2));
        sb.append(' ');
        o.c.a.a e2 = dVar.e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "this.dayOfWeek");
        sb.append((String) listOf.get(e2.a() - 1));
        return sb.toString();
    }

    public static final <TModel> n<TModel> a(n<List<TModel>> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$firstOrEmpty");
        return nVar.a((i<? super List<TModel>>) ExtensionsKt$firstOrEmpty$1.INSTANCE).g(ExtensionsKt$firstOrEmpty$2.INSTANCE);
    }

    public static final void a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setHtmlOrHide");
        int i2 = 0;
        if (!(str == null || str.length() == 0)) {
            v.a(textView, str);
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public static final String a(Uri uri, ContentResolver contentResolver) {
        Intrinsics.checkParameterIsNotNull(uri, "$this$getFileName");
        Intrinsics.checkParameterIsNotNull(contentResolver, "contentResolver");
        String scheme = uri.getScheme();
        String str = "";
        if (Intrinsics.areEqual((Object) scheme, (Object) "file")) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
            return str;
        } else if (!Intrinsics.areEqual((Object) scheme, (Object) "content")) {
            return str;
        } else {
            Cursor query = contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null && query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("_display_name"));
                Intrinsics.checkExpressionValueIsNotNull(string, "cursor.getString(cursor.…bleColumns.DISPLAY_NAME))");
                str = string;
            }
            query.close();
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r2 = kotlin.collections.CollectionsKt___CollectionsKt.union(r0, r2);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void a(h.p.r<java.util.List<T>> r1, java.util.List<? extends T> r2) {
        /*
            java.lang.String r0 = "$this$addAll"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "newValues"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.a()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0023
            java.util.Set r2 = kotlin.collections.CollectionsKt___CollectionsKt.union(r0, r2)
            if (r2 == 0) goto L_0x0023
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r2)
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != 0) goto L_0x0029
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0029:
            r1.postValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.util.ExtensionsKt.a(h.p.r, java.util.List):void");
    }

    public static final <T> void a(r<List<T>> rVar, T t2, Integer num) {
        List list;
        Intrinsics.checkParameterIsNotNull(rVar, "$this$update");
        if (num == null || num.intValue() != -1) {
            List a2 = rVar.a();
            if (a2 == null || (list = CollectionsKt___CollectionsKt.toMutableList(a2)) == null) {
                list = null;
            } else {
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                list.set(num.intValue(), t2);
            }
            rVar.postValue(list);
        }
    }

    public static final boolean a(c cVar, k.b.a0.b bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$disposeBy");
        Intrinsics.checkParameterIsNotNull(bVar, "disposables");
        return bVar.c(cVar);
    }

    public static final <TItemType> List<TItemType> a(Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "$this$cast");
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            List list = objArr[i2];
            if (list != null) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
                i2++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<TItemType>");
            }
        }
        return arrayList;
    }

    public static final void a(TextInputLayout textInputLayout) {
        Intrinsics.checkParameterIsNotNull(textInputLayout, "$this$markRequired");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textInputLayout.getHint());
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-65536);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" *");
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textInputLayout.setHint(new SpannedString(spannableStringBuilder));
    }

    public static final <T> j<T> a(T t2) {
        if (t2 != null) {
            b.a(t2, "item is null");
            j<T> a2 = k.b.a0.d.a(new g(t2));
            if (a2 != null) {
                return a2;
            }
        }
        j<T> c2 = j.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "Maybe.empty()");
        return c2;
    }
}
