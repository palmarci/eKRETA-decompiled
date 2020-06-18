// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ImageMapping
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class ImageMapping
  {
    private static Dictionary<string, string> _subjectMappings;
    private static Dictionary<string, string> _justificationStateMappings;

    static ImageMapping()
    {
      ImageMapping.InitSubjectMap();
      ImageMapping.InitJustificationMap();
    }

    private static void InitJustificationMap()
    {
      ImageMapping._justificationStateMappings = new Dictionary<string, string>()
      {
        {
          "UnJustified",
          "Ekreta.Mobile.Core.Images.ListItem_AbsencesUnJustified.png"
        },
        {
          "BeJustified",
          "Ekreta.Mobile.Core.Images.ListItem_AbsencesToJustify.png"
        },
        {
          "Justified",
          "Ekreta.Mobile.Core.Images.ListItem_AbsencesJustified.png"
        }
      };
    }

    private static void InitSubjectMap()
    {
      ImageMapping._subjectMappings = new Dictionary<string, string>()
      {
        {
          "Állampolgári ismeretek",
          "Ekreta.Mobile.Core.Images.SubjectIcon1.png"
        },
        {
          "Angol nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Biológia",
          "Ekreta.Mobile.Core.Images.SubjectIcon62.png"
        },
        {
          "Biológia-egészségtan",
          "Ekreta.Mobile.Core.Images.SubjectIcon62.png"
        },
        {
          "Diákotthoni feladat",
          "Ekreta.Mobile.Core.Images.SubjectIcon25.png"
        },
        {
          "Dráma és tánc",
          "Ekreta.Mobile.Core.Images.SubjectIcon33.png"
        },
        {
          "Egyéb",
          "Ekreta.Mobile.Core.Images.SubjectIcon56.png"
        },
        {
          "Egyéb nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Életvitel és gyakorlat",
          "Ekreta.Mobile.Core.Images.SubjectIcon63.png"
        },
        {
          "Ember és társadalom",
          "Ekreta.Mobile.Core.Images.SubjectIcon57.png"
        },
        {
          "Emberismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon2.png"
        },
        {
          "Ének-zene",
          "Ekreta.Mobile.Core.Images.SubjectIcon10.png"
        },
        {
          "Etika",
          "Ekreta.Mobile.Core.Images.SubjectIcon18.png"
        },
        {
          "Filozófia",
          "Ekreta.Mobile.Core.Images.SubjectIcon26.png"
        },
        {
          "Fizika",
          "Ekreta.Mobile.Core.Images.SubjectIcon34.png"
        },
        {
          "Földrajz",
          "Ekreta.Mobile.Core.Images.SubjectIcon42.png"
        },
        {
          "Francia nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Gyermekotthoni feladat",
          "Ekreta.Mobile.Core.Images.SubjectIcon50.png"
        },
        {
          "Háztartástan",
          "Ekreta.Mobile.Core.Images.SubjectIcon49.png"
        },
        {
          "Hit- és erkölcstan",
          "Ekreta.Mobile.Core.Images.SubjectIcon48.png"
        },
        {
          "Hon- és népismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon3.png"
        },
        {
          "Informatika",
          "Ekreta.Mobile.Core.Images.SubjectIcon11.png"
        },
        {
          "Kémia",
          "Ekreta.Mobile.Core.Images.SubjectIcon19.png"
        },
        {
          "Kéttannyevű célnyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Kollégiumi feladat",
          "Ekreta.Mobile.Core.Images.SubjectIcon27.png"
        },
        {
          "Könyvtárhasználat",
          "Ekreta.Mobile.Core.Images.SubjectIcon35.png"
        },
        {
          "Környezetismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon17.png"
        },
        {
          "Latin nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Magyar nyelv és irodalom",
          "Ekreta.Mobile.Core.Images.SubjectIcon58.png"
        },
        {
          "Matematika",
          "Ekreta.Mobile.Core.Images.SubjectIcon59.png"
        },
        {
          "Mozógképkultúra és médiaismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon4.png"
        },
        {
          "Művészetek",
          "Ekreta.Mobile.Core.Images.SubjectIcon12.png"
        },
        {
          "Művészettörténet",
          "Ekreta.Mobile.Core.Images.SubjectIcon12.png"
        },
        {
          "Na",
          "Ekreta.Mobile.Core.Images.SubjectIcon56.png"
        },
        {
          "Napközi",
          "Ekreta.Mobile.Core.Images.SubjectIcon13.png"
        },
        {
          "Német nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Nemzetiségi nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Olasz nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Orosz nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Osztályfőnöki, élet- és pályatervezés",
          "Ekreta.Mobile.Core.Images.SubjectIcon36.png"
        },
        {
          "Óvódai feladat",
          "Ekreta.Mobile.Core.Images.SubjectIcon70.png"
        },
        {
          "Pályaorientáció, szakmai alapozás",
          "Ekreta.Mobile.Core.Images.SubjectIcon52.png"
        },
        {
          "Rajz és műalkotások elemzése, vizuális kultúra",
          "Ekreta.Mobile.Core.Images.SubjectIcon12.png"
        },
        {
          "Spanyol nyelv",
          "Ekreta.Mobile.Core.Images.SubjectIcon9.png"
        },
        {
          "Szakértői bizottsági tevékenység",
          "Ekreta.Mobile.Core.Images.SubjectIcon60.png"
        },
        {
          "Szakmacsoportos alapozás",
          "Ekreta.Mobile.Core.Images.SubjectIcon58.png"
        },
        {
          "Szakmai elmélet",
          "Ekreta.Mobile.Core.Images.SubjectIcon20.png"
        },
        {
          "Szakmai elmélet (egészségügy)",
          "Ekreta.Mobile.Core.Images.SubjectIcon21.png"
        },
        {
          "Szakmai elmélet (egyéb szolgáltatások)",
          "Ekreta.Mobile.Core.Images.SubjectIcon29.png"
        },
        {
          "Szakmai elmélet (elektrotechnika-elektronika)",
          "Ekreta.Mobile.Core.Images.SubjectIcon26.png"
        },
        {
          "Szakmai elmélet (élelmiszeripar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon45.png"
        },
        {
          "Szakmai elmélet (építészet)",
          "Ekreta.Mobile.Core.Images.SubjectIcon53.png"
        },
        {
          "Szakmai elmélet (faipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon67.png"
        },
        {
          "Szakmai elmélet (gépészet)",
          "Ekreta.Mobile.Core.Images.SubjectIcon14.png"
        },
        {
          "Szakmai elmélet (informatika)",
          "Ekreta.Mobile.Core.Images.SubjectIcon11.png"
        },
        {
          "Szakmai elmélet (kereskedelem-marketing, üzleti adminisztráció)",
          "Ekreta.Mobile.Core.Images.SubjectIcon66.png"
        },
        {
          "Szakmai elmélet (könnyűipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon38.png"
        },
        {
          "Szakmai elmélet (környezetvédelem-vízgazdálkodás)",
          "Ekreta.Mobile.Core.Images.SubjectIcon46.png"
        },
        {
          "Szakmai elmélet (közgazdaságtan)",
          "Ekreta.Mobile.Core.Images.SubjectIcon54.png"
        },
        {
          "Szakmai elmélet (közlekedés)",
          "Ekreta.Mobile.Core.Images.SubjectIcon7.png"
        },
        {
          "Szakmai elmélet (mezőgazdaság)",
          "Ekreta.Mobile.Core.Images.SubjectIcon61.png"
        },
        {
          "Szakmai elmélet (művészet, közművelődés, kommunikáció)",
          "Ekreta.Mobile.Core.Images.SubjectIcon33.png"
        },
        {
          "Szakmai elmélet (nyomdaipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon65.png"
        },
        {
          "Szakmai elmélet (oktatás)",
          "Ekreta.Mobile.Core.Images.SubjectIcon68.png"
        },
        {
          "Szakmai elmélet (szociális szolgáltatások)",
          "Ekreta.Mobile.Core.Images.SubjectIcon23.png"
        },
        {
          "Szakmai elmélet (ügyvitel)",
          "Ekreta.Mobile.Core.Images.SubjectIcon31.png"
        },
        {
          "Szakmai elmélet (vegyipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon39.png"
        },
        {
          "Szakmai elmélet (vendéglátás-idegenforgalom)",
          "Ekreta.Mobile.Core.Images.SubjectIcon6.png"
        },
        {
          "Szakmai gyakorlat",
          "Ekreta.Mobile.Core.Images.SubjectIcon25.png"
        },
        {
          "Szakmai gyakorlat (egészségügy)",
          "Ekreta.Mobile.Core.Images.SubjectIcon21.png"
        },
        {
          "Szakmai gyakorlat (egyéb szolgáltatások)",
          "Ekreta.Mobile.Core.Images.SubjectIcon29.png"
        },
        {
          "Szakmai gyakorlat (elektrotechnika-elektronika)",
          "Ekreta.Mobile.Core.Images.SubjectIcon26.png"
        },
        {
          "Szakmai gyakorlat (élelmiszeripar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon45.png"
        },
        {
          "Szakmai gyakorlat (építészet)",
          "Ekreta.Mobile.Core.Images.SubjectIcon53.png"
        },
        {
          "Szakmai gyakorlat (faipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon67.png"
        },
        {
          "Szakmai gyakorlat (gépészet)",
          "Ekreta.Mobile.Core.Images.SubjectIcon14.png"
        },
        {
          "Szakmai gyakorlat (informatika)",
          "Ekreta.Mobile.Core.Images.SubjectIcon11.png"
        },
        {
          "Szakmai gyakorlat (kereskedelem-marketing, üzleti adminisztráció)",
          "Ekreta.Mobile.Core.Images.SubjectIcon66.png"
        },
        {
          "Szakmai gyakorlat (könnyűipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon38.png"
        },
        {
          "Szakmai gyakorlat (környezetvédelem-vízgazdálkodás)",
          "Ekreta.Mobile.Core.Images.SubjectIcon66.png"
        },
        {
          "Szakmai gyakorlat (közgazdaságtan)",
          "Ekreta.Mobile.Core.Images.SubjectIcon54.png"
        },
        {
          "Szakmai gyakorlat (közlekedés)",
          "Ekreta.Mobile.Core.Images.SubjectIcon7.png"
        },
        {
          "Szakmai gyakorlat (mezőgazdaság)",
          "Ekreta.Mobile.Core.Images.SubjectIcon61.png"
        },
        {
          "Szakmai gyakorlat (művészet, közművelődés, kommunikáció)",
          "Ekreta.Mobile.Core.Images.SubjectIcon33.png"
        },
        {
          "Szakmai gyakorlat (nyomdaipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon65.png"
        },
        {
          "Szakmai gyakorlat (oktatás)",
          "Ekreta.Mobile.Core.Images.SubjectIcon68.png"
        },
        {
          "Szakmai gyakorlat (szociális szolgáltatások)",
          "Ekreta.Mobile.Core.Images.SubjectIcon23.png"
        },
        {
          "Szakmai gyakorlat (ügyvitel)",
          "Ekreta.Mobile.Core.Images.SubjectIcon31.png"
        },
        {
          "Szakmai gyakorlat (vegyipar)",
          "Ekreta.Mobile.Core.Images.SubjectIcon39.png"
        },
        {
          "Szakmai gyakorlat (vendéglátás-idegenforgalom)",
          "Ekreta.Mobile.Core.Images.SubjectIcon6.png"
        },
        {
          "Szakmai orientáció",
          "Ekreta.Mobile.Core.Images.SubjectIcon47.png"
        },
        {
          "Számítástechnika",
          "Ekreta.Mobile.Core.Images.SubjectIcon22.png"
        },
        {
          "Tánc és mozgás",
          "Ekreta.Mobile.Core.Images.SubjectIcon55.png"
        },
        {
          "Társadalmi ismeretek",
          "Ekreta.Mobile.Core.Images.SubjectIcon1.png"
        },
        {
          "Társadalmi, állampolgári és gazdasági ismeretek",
          "Ekreta.Mobile.Core.Images.SubjectIcon1.png"
        },
        {
          "Társadalomismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon1.png"
        },
        {
          "Technika, életvitel és gyakorlat",
          "Ekreta.Mobile.Core.Images.SubjectIcon8.png"
        },
        {
          "Természetismeret",
          "Ekreta.Mobile.Core.Images.SubjectIcon46.png"
        },
        {
          "Természettudományi gyakorlatok",
          "Ekreta.Mobile.Core.Images.SubjectIcon16.png"
        },
        {
          "Testnevelés és sport",
          "Ekreta.Mobile.Core.Images.SubjectIcon64.png"
        },
        {
          "Történelem, társadalmi és állampolgári ismeretek",
          "Ekreta.Mobile.Core.Images.SubjectIcon1.png"
        },
        {
          "Zeneművészet",
          "Ekreta.Mobile.Core.Images.SubjectIcon10.png"
        },
        {
          "Magatartás",
          "Ekreta.Mobile.Core.Images.SubjectIcon3.png"
        },
        {
          "Szorgalom",
          "Ekreta.Mobile.Core.Images.SubjectIcon40.png"
        }
      };
    }

    public static string GetImageSourceBySubjectName(string subjectName)
    {
      string str = string.Empty;
      if (!string.IsNullOrEmpty(subjectName))
        ImageMapping._subjectMappings.TryGetValue(subjectName, out str);
      if (string.IsNullOrEmpty(str))
        str = "Ekreta.Mobile.Core.Images.SubjectIcon56.png";
      return str;
    }

    public static string GetImageSourceByJustificationType(string justificationState)
    {
      string empty = string.Empty;
      if (!string.IsNullOrEmpty(justificationState))
        ImageMapping._justificationStateMappings.TryGetValue(justificationState, out empty);
      return empty;
    }
  }
}
