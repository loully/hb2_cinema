package fr.hb2.cinemaproject.cinemaapplication.demodata;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import fr.hb2.cinemaproject.cinemaapplication.dao.CategoriesDao;
import fr.hb2.cinemaproject.cinemaapplication.dao.FilmsDao;
import fr.hb2.cinemaproject.cinemaapplication.dao.RoomsDao;
import fr.hb2.cinemaproject.cinemaapplication.dao.SessionsDao;
import fr.hb2.cinemaproject.cinemaapplication.dao.ShedulesDao;
import fr.hb2.cinemaproject.cinemaapplication.dao.TeamMembersDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Categories;
import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Rooms;
import fr.hb2.cinemaproject.cinemaapplication.entities.Sessions;
import fr.hb2.cinemaproject.cinemaapplication.entities.Shedules;
import fr.hb2.cinemaproject.cinemaapplication.entities.TeamMembers;
import fr.hb2.cinemaproject.cinemaapplication.enums.Categorie;
import fr.hb2.cinemaproject.cinemaapplication.enums.Gender;
import fr.hb2.cinemaproject.cinemaapplication.enums.RoleMember;
import fr.hb2.cinemaproject.cinemaapplication.enums.SensoryExperience;


@Component
public class DemoData {

	@Autowired
	private RoomsDao roomsDAO;
	
	@Autowired
	private ShedulesDao schedulesDAO;
	
	@Autowired
	private FilmsDao filmsDAO;
	
	@Autowired
	private CategoriesDao categoriesDAO;
	
	@Autowired
	private TeamMembersDao teamMembersDAO;
	
	@Autowired
	private SessionsDao sessionDAO;

	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		
		// Fill Rooms
		
		  Rooms room1 = new Rooms(1,125,SensoryExperience.normal);
		  Rooms room2 = new Rooms(2,130,SensoryExperience.normal);
		  Rooms room3 = new Rooms(3,100,SensoryExperience.three_dimensions);
		  Rooms room4 = new Rooms(4,90,SensoryExperience.three_dimensions);
		  Rooms room5 = new Rooms(5,200,SensoryExperience.four_dimensions);
		  
		  roomsDAO.save(room1); 
		  roomsDAO.save(room2); 
		  roomsDAO.save(room3); 
		  roomsDAO.save(room4); 
		  roomsDAO.save(room5);
		 
		//Fill Categories
		
		  Categories cat_animation = new Categories(1,Categorie.animation); 
		  Categories cat_famille = new Categories(2,Categorie.famille); 
		  Categories cat_fantastique = new Categories(3,Categorie.fantastique); 
		  Categories cat_comedie = new Categories(4,Categorie.comédie); 
		  Categories cat_aventure = new Categories(5,Categorie.aventure); 
		  categoriesDAO.save(cat_animation);
		  categoriesDAO.save(cat_famille); 
		  categoriesDAO.save(cat_fantastique);
		  categoriesDAO.save(cat_comedie); 
		  categoriesDAO.save(cat_aventure);
		 
		
		// Fill Schedules
		
		  Shedules schedule1 = new Shedules(1l, LocalDate.parse("2021-06-01"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"));
		  Shedules schedule2 = new Shedules(2l, LocalDate.parse("2021-06-01"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"));
		  Shedules schedule3 = new Shedules(3l, LocalDate.parse("2021-06-01"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule4 = new Shedules(4l, LocalDate.parse("2021-06-01"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule5 = new Shedules(5l, LocalDate.parse("2021-06-02"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule6 = new Shedules(6l, LocalDate.parse("2021-06-02"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule7 = new Shedules(7l, LocalDate.parse("2021-06-02"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule8 = new Shedules(8l, LocalDate.parse("2021-06-02"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule9 = new Shedules(9l, LocalDate.parse("2021-06-03"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule10 = new Shedules(10l, LocalDate.parse("2021-06-03"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule11 = new Shedules(11l, LocalDate.parse("2021-06-03"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule12 = new Shedules(12l, LocalDate.parse("2021-06-03"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule13 = new Shedules(13l, LocalDate.parse("2021-06-04"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule14 = new Shedules(14l, LocalDate.parse("2021-06-04"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule15 = new Shedules(15l, LocalDate.parse("2021-06-04"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule16 = new Shedules(16l, LocalDate.parse("2021-06-04"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule17 = new Shedules(17l, LocalDate.parse("2021-06-05"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule18 = new Shedules(18l, LocalDate.parse("2021-06-05"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule19 = new Shedules(19l, LocalDate.parse("2021-06-05"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule20 = new Shedules(20l, LocalDate.parse("2021-06-05"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule21 = new Shedules(21l, LocalDate.parse("2021-06-06"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule22 = new Shedules(22l, LocalDate.parse("2021-06-06"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule23 = new Shedules(23l, LocalDate.parse("2021-06-06"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule24 = new Shedules(24l, LocalDate.parse("2021-06-06"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule25 = new Shedules(25l, LocalDate.parse("2021-06-07"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule26 = new Shedules(26l, LocalDate.parse("2021-06-07"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule27 = new Shedules(27l, LocalDate.parse("2021-06-07"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule28 = new Shedules(28l,LocalDate.parse("2021-06-07"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")); 
		  Shedules schedule29 = new Shedules(29l, LocalDate.parse("2021-06-08"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")); 
		  Shedules schedule30 = new Shedules(30l, LocalDate.parse("2021-06-08"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00")); 
		  Shedules schedule31 = new Shedules(31l, LocalDate.parse("2021-06-08"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00")); 
		  Shedules schedule32 = new Shedules(32l, LocalDate.parse("2021-06-08"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"));
		  
		  schedulesDAO.save(schedule1);
		  schedulesDAO.save(schedule2); 
		  schedulesDAO.save(schedule3);
		  schedulesDAO.save(schedule4);
		  schedulesDAO.save(schedule5);
		  schedulesDAO.save(schedule6);
		  schedulesDAO.save(schedule7);
		  schedulesDAO.save(schedule8);
		  schedulesDAO.save(schedule9);
		  schedulesDAO.save(schedule10);
		  schedulesDAO.save(schedule11);
		  schedulesDAO.save(schedule12);
		  schedulesDAO.save(schedule13);
		  schedulesDAO.save(schedule14);
		  schedulesDAO.save(schedule15);
		  schedulesDAO.save(schedule16);
		  schedulesDAO.save(schedule17);
		  schedulesDAO.save(schedule18);
		  schedulesDAO.save(schedule19);
		  schedulesDAO.save(schedule20);
		  schedulesDAO.save(schedule21);
		  schedulesDAO.save(schedule22);
		  schedulesDAO.save(schedule23);
		  schedulesDAO.save(schedule24);
		  schedulesDAO.save(schedule25);
		  schedulesDAO.save(schedule26);
		  schedulesDAO.save(schedule27);
		  schedulesDAO.save(schedule28);
		  schedulesDAO.save(schedule29);
		  schedulesDAO.save(schedule30);
		  schedulesDAO.save(schedule31);
		  schedulesDAO.save(schedule32);
		 
		  
		  // Fill films
		  Films soul = new Films(1l,"Soul","fr",LocalTime.parse("01:47:00"),LocalDate.parse("2020-12-25"),"Passionné de jazz et professeur de musique dans un collège, Joe Gardner a enfin l’opportunité de réaliser son rêve : jouer dans le meilleur club de jazz de New York.","https://fr.web.img4.acsta.net/c_310_420/pictures/20/10/15/11/09/5088324.jpg",cat_animation);
		  Films enavant = new Films(2l,"En avant","fr",LocalTime.parse("01:42:00"),LocalDate.parse("2020-03-04"),"Dans la banlieue d'un univers imaginaire, deux frères elfes se lancent dans une quête extraordinaire pour découvrir s'il reste encore un peu de magie dans le monde.","https://fr.web.img6.acsta.net/c_310_420/pictures/20/01/06/14/00/1992182.jpg",cat_famille);
		  Films toystory = new Films(3l,"Toy Story 4","fr",LocalTime.parse("01:40:00"),LocalDate.parse("2019-06-26"),"Woody a toujours privilégié la joie et le bien-être de ses jeunes propriétaires – Andy puis Bonnie – et de ses compagnons, n’hésitant pas à prendre tous les risques pour eux, aussi inconsidérés soient-ils.","https://fr.web.img6.acsta.net/c_310_420/pictures/19/06/12/17/42/4485647.jpg", cat_famille);
		  Films indestructibles = new Films(4l,"Les indestructibles 2","fr",LocalTime.parse("02:05:00"),LocalDate.parse("2018-07-04"),"Notre famille de super-héros préférée est de retour!","https://fr.web.img5.acsta.net/c_310_420/pictures/18/04/13/15/09/0323902.jpg",cat_famille);
		  Films coco = new Films(5l,"Coco","fr",LocalTime.parse("01:49:00"),LocalDate.parse("2017-11-29"),"Depuis déjà plusieurs générations, la musique est bannie dans la famille de Miguel. Un vrai déchirement pour le jeune garçon dont le rêve ultime est de devenir un musicien aussi accompli que son idole, Ernesto de la Cruz.","https://fr.web.img6.acsta.net/c_310_420/pictures/17/09/15/12/42/0056825.jpg",cat_aventure);
		  Films cars =new Films(6l,"Cars 3","fr", LocalTime.parse("01:49:00"),LocalDate.parse("2017-08-02"),"Dépassé par une nouvelle génération de bolides ultra-rapides, le célèbre Flash McQueen se retrouve mis sur la touche d’un sport qu’il adore.","https://fr.web.img5.acsta.net/c_310_420/pictures/17/04/12/14/42/499210.jpg",cat_fantastique);
		  Films dory = new Films(7l,"Le monde de Dory","fr",LocalTime.parse("01:35:00"),LocalDate.parse("2016-06-22"),"Dory, le poisson chirurgien bleu amnésique, mène une existence heureuse dans les récifs avec ses amis Nemo et Marin.","https://fr.web.img3.acsta.net/c_310_420/pictures/16/03/14/16/21/478890.jpg",cat_aventure);
		  Films arlo = new Films(8l,"Le Voyage d'Arlo", "fr", LocalTime.parse("01:40:00"),LocalDate.parse("2015-11-25"), "Et si la catastrophe cataclysmique qui a bouleversé la Terre et provoqué l'extinction des dinosaures n'avait jamais eu lieu ? ","https://fr.web.img3.acsta.net/c_310_420/pictures/15/10/07/09/50/031416.jpg",cat_aventure);
		  Films viceversa = new Films(9l,"Vice-Versa","fr",LocalTime.parse("01:42:00"),LocalDate.parse("2015-06-17"),"Au Quartier Général, le centre de contrôle situé dans la tête de la petite Riley, 11 ans, cinq émotions sont au travail. Lorsque la famille de Riley emménage dans une grande ville, avec tout ce que cela peut avoir d'effrayant.","https://fr.web.img3.acsta.net/c_310_420/pictures/15/04/16/13/58/571071.jpg",cat_famille);
		  Films monstres = new Films(10l,"Monstres Academy","fr",LocalTime.parse("01:50:00"),LocalDate.parse("2013-07-10"),"Même quand il n'était qu'un tout petit monstre, Bob Razowski rêvait déjà de devenir une Terreur. Aujourd'hui, il est enfin en première année à la prestigieuse université Monstres Academy, où sont formées les meilleures Terreurs.","https://fr.web.img3.acsta.net/medias/nmedia/18/91/41/04/20484519.jpg",cat_fantastique);

		
		// Fill TeamMembers
		  TeamMembers omarSy = new TeamMembers(1l,"Sy","Omar",Gender.homme,"fr",LocalDate.parse("1978-01-20"),RoleMember.acteur);
		  TeamMembers camilleCottin = new TeamMembers(2L,"Cottin","Camille",Gender.femme,"fr",LocalDate.parse("1978-12-01"),RoleMember.acteur);
		  TeamMembers docterPete = new TeamMembers(3L,"Docter","Pete",Gender.homme,"us",LocalDate.parse("1968-10-09"),RoleMember.réalisateur);
		  TeamMembers powersKemp = new TeamMembers(4L,"Powers","Kemp",Gender.homme,"us",LocalDate.parse("1974-01-01"),RoleMember.réalisateur);
		  TeamMembers scanlonDon = new TeamMembers(5L,"Scanlon","Dan",Gender.homme,"us",LocalDate.parse("1976-06-21"),RoleMember.réalisateur);
		  TeamMembers thomasS = new TeamMembers(6L,"Solivérès","Thomas",Gender.homme,"fr",LocalDate.parse("1990-07-11"), RoleMember.acteur);
		  TeamMembers pioM = new TeamMembers(7L,"Marmai","Pio",Gender.homme,"fr",LocalDate.parse("1984-07-13"),RoleMember.acteur);
		  TeamMembers cooleyJ = new TeamMembers(8L,"Cooley","Josh",Gender.homme,"us",LocalDate.parse("1974-01-08"), RoleMember.réalisateur);
		  TeamMembers jpP = new TeamMembers(9L,"Puymartin","Jean-Philippe",Gender.homme,"fr",LocalDate.parse("1957-01-19"), RoleMember.acteur);
		  TeamMembers richardD = new TeamMembers(10L,"Darbois","Richard",Gender.homme,"fr",LocalDate.parse("1957-12-07"), RoleMember.acteur);
		  TeamMembers bradB = new TeamMembers(11L,"Bird","Brad",Gender.homme,"us",LocalDate.parse("1957-09-24"), RoleMember.réalisateur);
		  TeamMembers gerardL = new TeamMembers(12L,"Lanvin","Gérard",Gender.homme,"fr",LocalDate.parse("1950-06-21"), RoleMember.acteur);
		  TeamMembers debP = new TeamMembers(13L,"Perret","Déborah",Gender.femme,"fr",LocalDate.parse("1959-01-01"), RoleMember.acteur);
		  TeamMembers andreaS = new TeamMembers(14L,"Santamaria","Andrea",Gender.homme,"fr",LocalDate.parse("2005-01-01"), RoleMember.acteur);
		  TeamMembers aryY = new TeamMembers(15L,"Abittan","Ary",Gender.homme,"fr",LocalDate.parse("1974-01-31"), RoleMember.acteur);
		  
		  TeamMembers ulrichL = new TeamMembers(16l,"Unkrich","Lee",Gender.homme,"us",LocalDate.parse("1967-08-08"), RoleMember.réalisateur);
		  TeamMembers adrianM = new TeamMembers(17l,"Molina","Adrian",Gender.homme,"mx",LocalDate.parse("1985-08-23"), RoleMember.réalisateur);
		  TeamMembers brianF = new TeamMembers(18l,"Fee","Brian",Gender.homme,"us",LocalDate.parse("1975-01-29"), RoleMember.réalisateur);
		  TeamMembers guiC = new TeamMembers(19l,"Canet","Guillaume",Gender.homme,"fr",LocalDate.parse("1973-04-10"), RoleMember.acteur);
		  TeamMembers aliceP = new TeamMembers(20l,"Pol","Alice",Gender.femme,"fr",LocalDate.parse("1982-12-03"), RoleMember.acteur);
		  TeamMembers andrewS = new TeamMembers(21l,"Stanton","Andrew",Gender.homme,"us",LocalDate.parse("1965-12-03"), RoleMember.réalisateur);
		  TeamMembers angusM = new TeamMembers(22l,"Maclane","Angus",Gender.homme,"us",LocalDate.parse("1975-01-01"), RoleMember.réalisateur);
		  TeamMembers celineM = new TeamMembers(23l,"Monsarrat","Céline",Gender.femme,"fr",LocalDate.parse("1954-01-13"), RoleMember.acteur);
		  TeamMembers franckD = new TeamMembers(24l,"Dubosc","Franck",Gender.homme,"fr",LocalDate.parse("1963-11-07"), RoleMember.acteur);
		  TeamMembers peterS = new TeamMembers(25l,"Sohn","Peter",Gender.homme,"us",LocalDate.parse("1977-01-23"), RoleMember.réalisateur);
		  TeamMembers jbC = new TeamMembers(26l,"Charles","Jean-Baptiste",Gender.homme,"fr",null,RoleMember.acteur);
		  TeamMembers oliviaB = new TeamMembers(27l,"Bonamy","Olivia",Gender.femme,"fr",LocalDate.parse("1972-09-21"), RoleMember.acteur);
		  TeamMembers ronaldoDC = new TeamMembers(28l,"Del Carmen","Ronaldo",Gender.homme,"us",LocalDate.parse("1959-12-31"), RoleMember.réalisateur);
		  TeamMembers charlotteLB = new TeamMembers(29l,"Le Bon","Charlotte",Gender.femme,"fr",LocalDate.parse("1986-09-04"), RoleMember.acteur);
		  TeamMembers pierreN = new TeamMembers(30l,"Niney","Pierre",Gender.homme,"fr",LocalDate.parse("1989-03-13"), RoleMember.acteur);
		  TeamMembers ericM = new TeamMembers(31l,"Métayer","Eric",Gender.homme,"fr",LocalDate.parse("1958-01-23"), RoleMember.acteur);
		  TeamMembers xavierF = new TeamMembers(32l,"Fagnon","Xavier",Gender.homme,"fr",LocalDate.parse("1972-11-22"), RoleMember.acteur);
		  
		  soul.addTeamMembers(omarSy);
		  soul.addTeamMembers(camilleCottin);
		  soul.addTeamMembers(docterPete);
		  soul.addTeamMembers(powersKemp);
		  enavant.addTeamMembers(scanlonDon);
		  enavant.addTeamMembers(thomasS);
		  enavant.addTeamMembers(pioM);
		  toystory.addTeamMembers(cooleyJ);
		  toystory.addTeamMembers(jpP);
		  toystory.addTeamMembers(richardD);
		  indestructibles.addTeamMembers(bradB);
		  indestructibles.addTeamMembers(gerardL);
		  indestructibles.addTeamMembers(debP);
		  
		  coco.addTeamMembers(andreaS);
		  coco.addTeamMembers(aryY);
		  coco.addTeamMembers(ulrichL);
		  coco.addTeamMembers(adrianM);
		  
		  cars.addTeamMembers(brianF);
		  cars.addTeamMembers(guiC);
		  cars.addTeamMembers(aliceP);
		  
		  dory.addTeamMembers(andrewS);
		  dory.addTeamMembers(angusM);
		  dory.addTeamMembers(celineM);
		  dory.addTeamMembers(franckD);

		  arlo.addTeamMembers(peterS);
		  arlo.addTeamMembers(jbC);
		  arlo.addTeamMembers(oliviaB);
		  
		  viceversa.addTeamMembers(ronaldoDC);
		  viceversa.addTeamMembers(charlotteLB);
		  viceversa.addTeamMembers(pierreN);
		  
		  monstres.addTeamMembers(ericM);
		  monstres.addTeamMembers(xavierF);
		  
		  
		  soul = filmsDAO.save(soul); 
		  enavant = filmsDAO.save(enavant); 
		  toystory = filmsDAO.save(toystory); 
		  indestructibles = filmsDAO.save(indestructibles); 
		  filmsDAO.save(coco); 
		  filmsDAO.save(cars); 
		  filmsDAO.save(dory); 
		  filmsDAO.save(arlo);
		  filmsDAO.save(viceversa);
		  filmsDAO.save(monstres);
		  		  
		  teamMembersDAO.save(omarSy);
		  teamMembersDAO.save(camilleCottin);
		  teamMembersDAO.save(docterPete);
		  teamMembersDAO.save(powersKemp);
		  teamMembersDAO.save(scanlonDon);
		  teamMembersDAO.save(thomasS);
		  teamMembersDAO.save(pioM);
		  teamMembersDAO.save(cooleyJ);
		  teamMembersDAO.save(jpP);
		  teamMembersDAO.save(richardD);
		  
		  teamMembersDAO.save(bradB);
		  teamMembersDAO.save(gerardL);
		  teamMembersDAO.save(debP);
		  
		  teamMembersDAO.save(andreaS);
		  teamMembersDAO.save(aryY);
		  teamMembersDAO.save(ulrichL);
		  teamMembersDAO.save(adrianM);
		  
		  teamMembersDAO.save(brianF);
		  teamMembersDAO.save(guiC);
		  teamMembersDAO.save(aliceP);
		  
		  teamMembersDAO.save(andrewS);
		  teamMembersDAO.save(angusM);
		  teamMembersDAO.save(celineM);
		  teamMembersDAO.save(franckD);
		  
		  teamMembersDAO.save(peterS);
		  teamMembersDAO.save(jbC);
		  teamMembersDAO.save(oliviaB);
		  
		  //vice versa
		  teamMembersDAO.save(ronaldoDC);
		  teamMembersDAO.save(charlotteLB);
		  teamMembersDAO.save(pierreN);
		  
		  //monstres academy
		  teamMembersDAO.save(ericM);
		  teamMembersDAO.save(xavierF);
		  
		  //Fill session
		  Sessions s1 = new Sessions(1l, room1, schedule1, soul);
		  Sessions s2 = new Sessions(2l, room2, schedule1, enavant);
		  Sessions s3 = new Sessions(3l, room1, schedule2, toystory);
		  Sessions s4 = new Sessions(4l, room2, schedule2, indestructibles);
		  Sessions s5 = new Sessions(5l, room1, schedule3, coco);
		  Sessions s6 = new Sessions(6l, room2, schedule3, cars);
		  Sessions s7 = new Sessions(7l, room1, schedule4, dory);
		  Sessions s8 = new Sessions(8l, room2, schedule4, arlo);
		  Sessions s9 = new Sessions(9l, room1, schedule5, viceversa);
		  Sessions s10 = new Sessions(10l, room2, schedule5, monstres);
		  Sessions s11 = new Sessions(11l, room1, schedule6, soul);
		  Sessions s12 = new Sessions(12l, room2, schedule6, enavant);
		  Sessions s13 = new Sessions(13l, room1, schedule7, toystory);
		  Sessions s14 = new Sessions(14l, room2, schedule7, indestructibles);
		  Sessions s15 = new Sessions(15l, room1, schedule8, coco);
		  Sessions s16 = new Sessions(16l, room2, schedule8, cars);
		  Sessions s17 = new Sessions(17l, room1, schedule9, dory);
		  Sessions s18 = new Sessions(18l, room2, schedule9, arlo);
		  Sessions s19 = new Sessions(19l, room1, schedule10, viceversa);
		  Sessions s20 = new Sessions(20l, room2, schedule10, monstres);
		  Sessions s21 = new Sessions(21l, room1, schedule11, soul);
		  Sessions s22 = new Sessions(22l, room2, schedule11, enavant);
		  Sessions s23 = new Sessions(23l, room1, schedule12, toystory);
		  Sessions s24 = new Sessions(24l, room2, schedule12, indestructibles);
		  Sessions s25 = new Sessions(25l, room1, schedule13, coco);
		  Sessions s26 = new Sessions(26l, room2, schedule13, cars);
		  Sessions s27 = new Sessions(27l, room1, schedule14, dory);
		  Sessions s28 = new Sessions(28l, room2, schedule14, arlo);
		  Sessions s29 = new Sessions(29l, room1, schedule15, viceversa);
		  Sessions s30 = new Sessions(30l, room2, schedule15, monstres);
		  Sessions s31 = new Sessions(31l, room1, schedule16, soul);
		  Sessions s32 = new Sessions(32l, room2, schedule16, enavant);
		  Sessions s33 = new Sessions(33l, room1, schedule17, toystory);
		  Sessions s34 = new Sessions(34l, room2, schedule17, indestructibles);
		  Sessions s35 = new Sessions(35l, room1, schedule18, coco);
		  Sessions s36 = new Sessions(36l, room2, schedule18, cars);
		  Sessions s37 = new Sessions(37l, room1, schedule19, dory);
		  Sessions s38 = new Sessions(38l, room2, schedule19, arlo);
		  Sessions s39 = new Sessions(39l, room1, schedule20, viceversa);
		  Sessions s40 = new Sessions(40l, room2, schedule20, monstres);
		  Sessions s41 = new Sessions(41l, room1, schedule21, soul);
		  Sessions s42 = new Sessions(42l, room2, schedule21, enavant);
		  Sessions s43 = new Sessions(43l, room1, schedule22, toystory);
		  Sessions s44 = new Sessions(44l, room2, schedule22, indestructibles);
		  Sessions s45 = new Sessions(45l, room1, schedule23, coco);
		  Sessions s46 = new Sessions(46l, room2, schedule23, cars);
		  Sessions s47 = new Sessions(47l, room1, schedule24, dory);
		  Sessions s48 = new Sessions(48l, room2, schedule24, arlo);
		  Sessions s49 = new Sessions(49l, room1, schedule25, viceversa);
		  Sessions s50 = new Sessions(50l, room2, schedule25, monstres);
		  Sessions s51 = new Sessions(51l, room1, schedule26, soul);
		  Sessions s52 = new Sessions(52l, room2, schedule26, enavant);
		  Sessions s53 = new Sessions(53l, room1, schedule27, toystory);
		  Sessions s54 = new Sessions(54l, room2, schedule27, indestructibles);
		  Sessions s55 = new Sessions(55l, room1, schedule28, coco);
		  Sessions s56 = new Sessions(56l, room2, schedule28, cars);
		  Sessions s57 = new Sessions(57l, room1, schedule29, dory);
		  Sessions s58 = new Sessions(58l, room2, schedule29, arlo);
		  Sessions s59 = new Sessions(59l, room1, schedule30, viceversa);
		  Sessions s60 = new Sessions(60l, room2, schedule30, monstres);
		  Sessions s61 = new Sessions(61l, room1, schedule31, soul);
		  Sessions s62 = new Sessions(62l, room2, schedule31, enavant);
		  Sessions s63 = new Sessions(63l, room1, schedule32, toystory);
		  Sessions s64 = new Sessions(64l, room2, schedule32, indestructibles);
		  
//		  sessionDAO.save(s1);
//		  sessionDAO.save(s2);
//		  sessionDAO.save(s3);
//		  sessionDAO.save(s4);
//		  sessionDAO.save(s5);
//		  sessionDAO.save(s6);
//		  sessionDAO.save(s7);
//		  sessionDAO.save(s8);
//		  sessionDAO.save(s9);
//		  sessionDAO.save(s10);
//		  sessionDAO.save(s11);
//		  sessionDAO.save(s12);
//		  sessionDAO.save(s13);
//		  sessionDAO.save(s14);
//		  sessionDAO.save(s15);
//		  sessionDAO.save(s16);
//		  sessionDAO.save(s17);
//		  sessionDAO.save(s18);
//		  sessionDAO.save(s19);
//		  sessionDAO.save(s20);
//		  sessionDAO.save(s21);
//		  sessionDAO.save(s22);
//		  sessionDAO.save(s23);
//		  sessionDAO.save(s24);
//		  sessionDAO.save(s25);
//		  sessionDAO.save(s26);
//		  sessionDAO.save(s27);
//		  sessionDAO.save(s28);
//		  sessionDAO.save(s29);
//		  sessionDAO.save(s30);
//		  sessionDAO.save(s31);
//		  sessionDAO.save(s32);
//		  sessionDAO.save(s33);
//		  sessionDAO.save(s34);
//		  sessionDAO.save(s35);
//		  sessionDAO.save(s36);
//		  sessionDAO.save(s37);
//		  sessionDAO.save(s38);
//		  sessionDAO.save(s39);
//		  sessionDAO.save(s40);
//		  sessionDAO.save(s41);
//		  sessionDAO.save(s42);
//		  sessionDAO.save(s43);
//		  sessionDAO.save(s44);
//		  sessionDAO.save(s45);
//		  sessionDAO.save(s46);
//		  sessionDAO.save(s47);
//		  sessionDAO.save(s48);
//		  sessionDAO.save(s49);
//		  sessionDAO.save(s50);
//		  sessionDAO.save(s51);
//		  sessionDAO.save(s52);
//		  sessionDAO.save(s53);
//		  sessionDAO.save(s54);
//		  sessionDAO.save(s55);
//		  sessionDAO.save(s56);
//		  sessionDAO.save(s57);
//		  sessionDAO.save(s58);
//		  sessionDAO.save(s59);
//		  sessionDAO.save(s60);
//		  sessionDAO.save(s61);
//		  sessionDAO.save(s62);
//		  sessionDAO.save(s63);
//		  sessionDAO.save(s64);
		  		  
		 
	}
	
	
	
}
