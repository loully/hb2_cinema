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
		
		
		  roomsDAO.save(new Rooms(1,125,SensoryExperience.normal)); 
		  roomsDAO.save(new Rooms(2,130,SensoryExperience.normal)); 
		  roomsDAO.save(new Rooms(3,100,SensoryExperience.three_dimensions)); 
		  roomsDAO.save(new Rooms(4,90,SensoryExperience.three_dimensions)); 
		  roomsDAO.save(new Rooms(5,200,SensoryExperience.four_dimensions));
		 
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
		
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-01"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00")));
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-01"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-01"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-01"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-02"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-02"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-02"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-02"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-03"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-03"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-03"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-03"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-04"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-04"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-04"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-04"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-05"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-05"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-05"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-05"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-06"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-06"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-06"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-06"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-07"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-07"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-07"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-07"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-08"),LocalTime.parse("10:30:00"), LocalTime.parse("12:30:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-08"),LocalTime.parse("14:00:00"), LocalTime.parse("16:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-08"),LocalTime.parse("17:00:00"), LocalTime.parse("19:00:00"))); 
		  schedulesDAO.save(new Shedules(LocalDate.parse("2021-06-08"),LocalTime.parse("20:00:00"), LocalTime.parse("22:00:00")));
	
		  
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
		  		  
		 
	}
	
	
	
}
