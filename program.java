// Nome: Victor Picussa GRR: 20163068

/*
  =============================================================================
  @ Main Program
  =============================================================================
*/
class Program
{
  public static void main(String args[])
  {
    StreamingApp userAccount = StreamingApp.getInstance("Victor Picussa", "Preemium");

    Music music1 = new Music("Hanuman", "Flamenco", 223);
    Music music2 = new Music("Buster Voodoo", "Flamenco", 264);
    Music music3 = new Music("Logos", "Flamenco", 171);
    Music music4 = new Music("Hora Zero", "Flamenco", 325);
    Music music5 = new Music("Chac Mool", "Flamenco", 111);

    Music music6 = new Music("The Soundmaker", "Flamenco", 292);
    Music music7 = new Music("Torito", "Flamenco", 303);
    Music music8 = new Music("Sunday Neurosis", "Flamenco", 316);
    Music music9 = new Music("Fram", "Flamenco", 270);
    Music music10 = new Music("The Russian Messenger", "Flamenco", 293);

    Music music11 = new Music("Hardwired", "Metal", 189);
    Music music12 = new Music("Dream No More", "Metal", 390);
    Music music13 = new Music("Halo On Fire", "Metal", 495);
    Music music14 = new Music("Confusion", "Metal", 401);
    Music music15 = new Music("Spit Out The Bone", "Metal", 429);

    Music music16 = new Music("Eye Of The Beholder", "Metal", 390);
    Music music17 = new Music("One", "Metal", 447);
    Music music18 = new Music("Harvester Of Sorrow", "Metal", 346);
    Music music19 = new Music("The Frayed Ends Of Sanity", "Metal", 464);
    Music music20 = new Music("To Live Is To Die", "Metal", 589);

    Music music21 = new Music("Prelude to Hell", "Rap", 172);
    Music music22 = new Music("Fortunate", "Rap", 226);
    Music music23 = new Music("Southsiders", "Rap", 192);
    Music music24 = new Music("Star Shaped Heart", "Rap", 199);
    Music music25 = new Music("Kanye West", "Rap", 242);

    Music music26 = new Music("Like A Fire", "Rap", 219);
    Music music27 = new Music("No Biggie", "Rap", 156);
    Music music28 = new Music("Sugar", "Rap", 236);
    Music music29 = new Music("Still Be Here", "Rap", 237);
    Music music30 = new Music("Ringo", "Rap", 231);

    Music music31 = new Music("Space Oddity", "Pop", 316);
    Music music32 = new Music("Rebel Rebel", "Pop", 271);
    Music music33 = new Music("Young Americans", "Pop", 194);
    Music music34 = new Music("Golden Years", "Pop", 210);
    Music music35 = new Music("Heroes", "Pop", 217);

    Music music36 = new Music("Blackstar", "Pop", 598);
    Music music37 = new Music("Lazarus", "Pop", 382);
    Music music38 = new Music("Girl Loves Me", "Pop", 292);
    Music music39 = new Music("Dollar Days", "Pop", 285);
    Music music40 = new Music("I Can't Give Everything Away", "Pop", 347);

    Music music41 = new Music("They're here", "Synthwave", 159);
    Music music42 = new Music("Poison", "Synthwave", 279);
    Music music43 = new Music("Spacewalk", "Synthwave", 282);
    Music music44 = new Music("Signals", "Synthwave", 221);
    Music music45 = new Music("Nightdrive", "Synthwave", 271);

    Music music46 = new Music("The Descent", "Synthwave", 64);
    Music music47 = new Music("Battle", "Synthwave", 256);
    Music music48 = new Music("Moon Runner", "Synthwave", 220);
    Music music49 = new Music("Odyssey", "Synthwave", 258);
    Music music50 = new Music("No Survivors", "Synthwave", 222);

    Music music51 = new Music("Strangers In The Night", "Jazz", 165);
    Music music52 = new Music("My Way", "Jazz", 276);
    Music music53 = new Music("Theme From New York, New York", "Jazz", 205);
    Music music54 = new Music("Summer Wind", "Jazz", 175);
    Music music55 = new Music("The Way You Look Tonight", "Jazz", 202);

    Music music56 = new Music("The Girl From Ipanema", "Jazz", 195);
    Music music57 = new Music("Quiet Nights Of Quiet Stars", "Jazz", 164);
    Music music58 = new Music("Dindi", "Jazz", 209);
    Music music59 = new Music("I Concentrate On You", "Jazz", 157);
    Music music60 = new Music("Once I Loved", "Jazz", 156);

    Music music61 = new Music("Bamboléo", "Flamenco", 203);
    Music music62 = new Music("Moorea", "Flamenco", 240);
    Music music63 = new Music("Faena", "Flamenco", 206);
    Music music64 = new Music("Quiero Saber", "Flamenco", 246);
    Music music65 = new Music("Duende", "Flamenco", 258);

    Music music66 = new Music("Tu Quieres Volver", "Flamenco", 192);
    Music music67 = new Music("Un Amor", "Flamenco", 217);
    Music music68 = new Music("A Mi Manera", "Flamenco", 232);
    Music music69 = new Music("Volare", "Flamenco", 219);
    Music music70 = new Music("Vamos A Bailar", "Flamenco", 309);

    Music music71 = new Music("Metal Gods", "Metal", 238);
    Music music72 = new Music("Breaking the Law", "Metal", 154);
    Music music73 = new Music("United", "Metal", 215);
    Music music74 = new Music("Living After Midnight", "Metal", 210);
    Music music75 = new Music("Steeler", "Metal", 269);

    Music music76 = new Music("Painkiller", "Metal", 366);
    Music music77 = new Music("Metal Meltdown", "Metal", 288);
    Music music78 = new Music("Night Crawler", "Metal", 344);
    Music music79 = new Music("A Touch of Evil", "Metal", 344);
    Music music80 = new Music("One Shot at Glory", "Metal", 408);

    Music music81 = new Music("Everybody", "Rap", 162);
    Music music82 = new Music("Take It Back", "Rap", 400);
    Music music83 = new Music("America", "Rap", 331);
    Music music84 = new Music("1-800-273-8255", "Rap", 250);
    Music music85 = new Music("Anziety", "Rap", 413);

    Music music86 = new Music("Bring Da Ruckus", "Rap", 251);
    Music music87 = new Music("Wu-Tang Clan Aint Nuthing ta F' Wit", "Rap", 216);
    Music music88 = new Music("C.R.E.A.M.", "Rap", 252);
    Music music89 = new Music("Method Man", "Rap", 351);
    Music music90 = new Music("Protect Ya Neck", "Rap", 291);

    Music music91 = new Music("The Girl From Ipanema", "Jazz", 195);
    Music music92 = new Music("Quiet Nights Of Quiet Stars", "Jazz", 164);
    Music music93 = new Music("Dindi", "Jazz", 209);
    Music music94 = new Music("I Concentrate On You", "Jazz", 157);
    Music music95 = new Music("Once I Loved", "Jazz", 156);

    Music music96 = new Music("Alive", "Pop", 262);
    Music music97 = new Music("One Million Bullets", "Pop", 252);
    Music music98 = new Music("Unstoppable", "Pop", 218);
    Music music99 = new Music("Broken Glass", "Pop", 288);
    Music music100 = new Music("The Greatest", "Pop", 211);

    Album album1 = new Album("11:11", "Rodrigo y Gabriela", "Flamenco");
    album1.add(music1);
    album1.add(music2);
    album1.add(music3);
    album1.add(music4);
    album1.add(music5);

    Album album2 = new Album("9 Dead Alive", "Rodrigo y Gabriela", "Flamenco");
    album2.add(music6);
    album2.add(music7);
    album2.add(music8);
    album2.add(music9);
    album2.add(music10);

    Album album3 = new Album("Hardwire...To Self-Destruct", "Metallica", "Metal");
    album3.add(music11);
    album3.add(music12);
    album3.add(music13);
    album3.add(music14);
    album3.add(music15);

    Album album4 = new Album("...And Justice For All", "Metallica", "Metal");
    album4.add(music16);
    album4.add(music17);
    album4.add(music18);
    album4.add(music19);
    album4.add(music20);

    Album album5 = new Album("Sothsiders", "Atmosphere", "Rap");
    album5.add(music21);
    album5.add(music22);
    album5.add(music23);
    album5.add(music24);
    album5.add(music25);

    Album album6 = new Album("Fishing Blues", "Atmosphere", "Rap");
    album6.add(music26);
    album6.add(music27);
    album6.add(music28);
    album6.add(music29);
    album6.add(music30);

    Album album7 = new Album("Best Of Bowie", "David Bowie", "Pop");
    album7.add(music31);
    album7.add(music32);
    album7.add(music33);
    album7.add(music34);
    album7.add(music35);

    Album album8 = new Album("Blackstar", "David Bowie", "Pop");
    album8.add(music36);
    album8.add(music37);
    album8.add(music38);
    album8.add(music39);
    album8.add(music40);

    Album album9 = new Album("Send the Signal", "Dance With the Dead", "Synthwave");
    album9.add(music41);
    album9.add(music42);
    album9.add(music43);
    album9.add(music44);
    album9.add(music45);

    Album album10 = new Album("Into the Abyss", "Dance With the Dead", "Synthwave");
    album10.add(music46);
    album10.add(music47);
    album10.add(music48);
    album10.add(music49);
    album10.add(music50);

    Album album11 = new Album("Nothing But The Best", "Frank Sinatra", "Jazz");
    album11.add(music51);
    album11.add(music52);
    album11.add(music53);
    album11.add(music54);
    album11.add(music55);

    Album album12 = new Album("Francis Albert Sinatra & Antonio Carlos Jobim", "Frank Sinatra", "Jazz");
    album12.add(music56);
    album12.add(music57);
    album12.add(music58);
    album12.add(music59);
    album12.add(music60);

    Album album13 = new Album("Gipsy Kings", "Gipsy Kings", "Flamenco");
    album13.add(music60);
    album13.add(music61);
    album13.add(music62);
    album13.add(music63);
    album13.add(music64);

    Album album14 = new Album("Original Album Classiscs", "Gipsy Kings", "Flamenco");
    album14.add(music66);
    album14.add(music67);
    album14.add(music68);
    album14.add(music69);
    album14.add(music70);

    Album album15 = new Album("British Steel", "Judas Priest", "Metal");
    album15.add(music71);
    album15.add(music72);
    album15.add(music73);
    album15.add(music74);
    album15.add(music75);

    Album album16 = new Album("Painkiller", "Judas Priest", "Metal");
    album16.add(music76);
    album16.add(music77);
    album16.add(music78);
    album16.add(music79);
    album16.add(music80);

    Album album17 = new Album("Everybody", "Logic", "Rap");
    album17.add(music81);
    album17.add(music82);
    album17.add(music83);
    album17.add(music84);
    album17.add(music85);

    Album album18 = new Album("Enter The Wu-Tang Clan", "Wu-Tang Clan", "Rap");
    album18.add(music86);
    album18.add(music87);
    album18.add(music88);
    album18.add(music89);
    album18.add(music90);

    Album album19 = new Album("In Between Dreams", "Jack Johnsson", "Pop");
    album19.add(music91);
    album19.add(music92);
    album19.add(music93);
    album19.add(music94);
    album19.add(music95);

    Album album20 = new Album("This Is Acting", "Sia", "Pop");
    album20.add(music96);
    album20.add(music97);
    album20.add(music98);
    album20.add(music99);
    album20.add(music100);

    Playlist playlist1 = new Playlist("The Chords Between Metal and Flamenco", "Metal", "Flamenco");
    playlist1.add(album3);
    playlist1.add(album4);
    playlist1.add(album1);
    playlist1.add(album2);

    Playlist playlist2 = new Playlist("Pop Hop Rap", "Rap", "Pop");
    playlist2.add(album5);
    playlist2.add(album6);
    playlist2.add(album7);
    playlist2.add(album8);

    Playlist playlist3 = new Playlist("Eletrical and Acoustic", "Metal", "Flamenco");
    playlist3.add(album13);
    playlist3.add(album14);
    playlist3.add(album15);
    playlist3.add(album16);
    playlist3.add(playlist1);

    Playlist playlist4 = new Playlist("Old Jazz New Synth", "Synthwave", "Jazz");
    playlist4.add(album9);
    playlist4.add(album10);
    playlist4.add(album11);
    playlist4.add(album12);

    Playlist playlist5 = new Playlist("The Media And The Streets", "Rap", "Pop");
    playlist5.add(album17);
    playlist5.add(album18);
    playlist5.add(album19);
    playlist5.add(album20);
    playlist5.add(playlist2);

    userAccount.add(playlist1);
    userAccount.add(playlist2);
    userAccount.add(playlist3);
    userAccount.add(playlist4);
    userAccount.add(playlist5);

    ListAllVisitor listall = new ListAllVisitor();
    ListStyleMusicsVisitor listStyle = new ListStyleMusicsVisitor("Metal");
    ListThreeMinutesVisitor listThreeMinutes = new ListThreeMinutesVisitor("Metal");

    System.out.println();
    System.out.println("================== LIST ALL ==================");
    System.out.println();
    userAccount.getDirectory().accept(listall);
    System.out.println("================== LIST ALL ==================");

    System.out.println();
    System.out.println("================== LIST STYLE MUSICS ==================");
    System.out.println();
    userAccount.getDirectory().accept(listStyle);
    System.out.println();
    System.out.println("================== LIST STYLE MUSICS ==================");

    System.out.println();
    System.out.println("================== LIST THREE MINUTES ==================");
    System.out.println();
    userAccount.getDirectory().accept(listThreeMinutes);
    System.out.println("================== LIST THREE MINUTES ==================");
  }
}
