public class traitInfo {
    public static String getInfo(int choice){
        String message = "";
        switch(choice){
            case 0:
                message = "well... It's the name";
            break;
            case 1:
                message = "class: poisonous=p edible=e";
            break;
            case 2:
                message = "cap size in cm";
            break;    
            case 3:
                message = "cap shape: bell=b, conical=c, convex=x, flat=f, sunken=s, spherical=p, others=o";
            break;
            case 4:
                message = "cap surface: fibrous=i, grooves=g, scaly=y, smooth=s, dry=d, shiny=h, leathery=l, silky=k, sticky=t, wrinkled=w, fleshy=e";
            break;
            case 5:
                message = "cap color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k";
            break;
            case 6:
                message = "has-bruises: bruises-or-bleeding=t,no=f";
            break;
            case 7:
                message = "gill-attachment: adnate=a, adnexed=x, decurrent=d, free=e, sinuate=s, pores=p, none=f, unknown=?";
            break;
            case 8:
                message = "gill-spacing: close=c, distant=d, none=f";
            break;
            case 9:
                message = "gill-color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k, none = f";
            break;
            case 10:
                message = "stem-height in cm";
            break;
            case 11:
                message = "stem-width in mm (diameter)";
            break;
            case 12:
                message = "stem-root: bulbous=b, swollen=s, club=c, cup=u, equal=e, rhizomorphs=z, rooted=r";
            break;
            case 13:
                message = "stem-surface: fibrous=i, grooves=g, scaly=y, smooth=s, dry=d, shiny=h, leathery=l, silky=k, sticky=t, wrinkled=w, fleshy=e, none = f";
            break;
            case 14:
                message = "stem-color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k, none = f";
            break;
            case 15:
                message = "veil-type: partial=p, universal=u";
            break;
            case 16:
                message = "veil-color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k, none = f";
            break;
            case 17:
                message = "has-ring: ring=t, none=f";
            break;
            case 18:
                message = "ring-type: cobwebby=c, evanescent=e, flaring=r, grooved=g, large=l, pendant=p, sheathing=s, zone=z, scaly=y, movable=m, none=f, unknown=?";
            break;
            case 19:
                message = "ring-color: veil-color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k, none = f";
            break;
            case 20:
                message = "spore-print-color:ring-color: veil-color: brown=n, buff=b, gray=g, green=r, pink=p, purple=u, red=e, white=w, yellow=y, blue=l, orange=o,  black=k, none = f";
            break;
            case 21:
                message = "habitat: grasses=g, leaves=l, meadows=m, paths=p, heaths=h, urban=u, waste=w, woods=d";
            break;
            case 22:
                message = "spring=s, summer=u, autumn=a, winter=w";
            break;    
            case 23:
                message = "not completely sure what this is";
            break;    
        }
        return message;
    }
}
