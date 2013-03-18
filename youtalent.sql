-- phpMyAdmin SQL Dump
-- version 3.5.5
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Jeu 07 Mars 2013 à 17:52
-- Version du serveur: 5.5.29
-- Version de PHP: 5.4.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `youtalent`
--

-- --------------------------------------------------------

--
-- Structure de la table `commentaire`
--

CREATE TABLE `commentaire` (
  `id_commentaire` int(11) NOT NULL AUTO_INCREMENT,
  `commentaire` mediumtext NOT NULL,
  `date_commentaire` date NOT NULL,
  `id_utilisateur` int(11) DEFAULT NULL,
  `id_video` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_commentaire`),
  UNIQUE KEY `id_commentaire` (`id_commentaire`),
  KEY `id_utilisateur` (`id_utilisateur`),
  KEY `id_video` (`id_video`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `commentaire`
--

INSERT INTO `commentaire` (`id_commentaire`, `commentaire`, `date_commentaire`, `id_utilisateur`, `id_video`) VALUES
(2, 'Video super sympa', '2013-03-06', 1, 1),
(3, 'Super', '2013-03-06', 1, 1),
(4, 'NUL', '2013-04-17', 6, 4),
(5, 'NUL', '2013-04-17', 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `participe`
--

CREATE TABLE `participe` (
  `id_utilisateur` int(11) NOT NULL DEFAULT '0',
  `id_tournoi` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_utilisateur`,`id_tournoi`),
  KEY `id_tournoi` (`id_tournoi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `tournoi`
--

CREATE TABLE `tournoi` (
  `id_tournoi` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(30) NOT NULL,
  `description_tournoi` longtext NOT NULL,
  `date_tournoi` date NOT NULL,
  `resultat_tournoi` varchar(30) NOT NULL,
  `nombre_vote` int(11) NOT NULL,
  PRIMARY KEY (`id_tournoi`),
  UNIQUE KEY `id_tournoi` (`id_tournoi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id_utilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `nom_de_scene` varchar(20) NOT NULL,
  `mail` varchar(40) NOT NULL,
  `adresse` varchar(40) NOT NULL,
  `pays` varchar(30) NOT NULL,
  `ville` varchar(30) NOT NULL,
  `login` varchar(20) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  `droit` varchar(10) NOT NULL,
  `talent` longtext NOT NULL,
  `telephone` int(11) NOT NULL,
  `date_inscription` date NOT NULL,
  `avatar` varchar(255) NOT NULL,
  PRIMARY KEY (`id_utilisateur`),
  UNIQUE KEY `id_utilisateur` (`id_utilisateur`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_utilisateur`, `nom`, `prenom`, `nom_de_scene`, `mail`, `adresse`, `pays`, `ville`, `login`, `mdp`, `droit`, `talent`, `telephone`, `date_inscription`, `avatar`) VALUES
(1, 'Benyahia', 'Badr', 'BN11', 'b.benyahia@hotmail.fr', '6 rue du test', 'Boulogne / France', '2013-03-06', 'badr', 'mdptest', 'admin', 'Description du talent', 0, '0000-00-00', ''),
(6, 'Casamayou', 'Clément', 'Clems', 'clement.casa@gmail.com', '30 avenue de saint-ouen', 'France', 'Paris', 'clems', 'azerty', 'user', 'Je sais faire du vélo', 622839304, '2013-03-04', '/img/ok'),
(7, 'Sin Ronia', 'Christophe', 'chris', 'christophe@gmail.com', '19 rue du plateau', 'France', 'Paris', 'christof', 'okay', 'user', 'Je sais faire ', 738736472, '2013-03-11', 'test.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `video`
--

CREATE TABLE `video` (
  `id_video` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(30) NOT NULL,
  `description_video` longtext NOT NULL,
  `genre` varchar(30) NOT NULL,
  `lien_video` varchar(50) NOT NULL,
  `lien_image` varchar(60) NOT NULL,
  `nbvote` int(10) unsigned NOT NULL,
  `date_ajout` date NOT NULL,
  `id_utilisateur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_video`),
  UNIQUE KEY `id_video` (`id_video`),
  KEY `id_utilisateur` (`id_utilisateur`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `video`
--

INSERT INTO `video` (`id_video`, `titre`, `description_video`, `genre`, `lien_video`, `lien_image`, `nbvote`, `date_ajout`, `id_utilisateur`) VALUES
(1, 'Badr danse', 'Vidéo de danse de moi qui fais de la tectonik', 'Danse', 'http://www.youtube.com/embed/K_bOvzHMYBo', 'http://img.youtube.com/vi/K_bOvzHMYBo/0.jpg', 100, '2013-03-06', 1),
(2, 'Moto', 'Moto en roue arrière', 'Sport', 'http://www.youtube.com/embed/t9aPtNC-rIs', 'http://img.youtube.com/vi/t9aPtNC-rIs/0.jpg', 50, '2013-03-15', 6),
(3, 'Taekwondo compet', 'Compétition de taekwondo', 'Sport', 'http://www.youtube.com/embed/vtcC_0cT1uk', 'http://img.youtube.com/vi/vtcC_0cT1uk/0.jpg', 75, '2013-03-15', 7),
(4, 'Voiture drift', 'Voiture qui drift', 'Musique', 'http://www.youtube.com/embed/LwzOB4UdSu4', 'http://img.youtube.com/vi/LwzOB4UdSu4/0.jpg', 80, '2013-03-29', 6),
(5, 'dubstep', 'video de dubstep', 'Musique', 'http://www.youtube.com/embed/M_aueYyzpCw', 'http://img.youtube.com/vi/M_aueYyzpCw/0.jpg', 110, '2013-03-01', 1),
(6, 'bizar', 'un truc pas normal', 'divers', 'http://www.youtube.com/watch?v=ToU3D7IJjRA', 'http://img.youtube.com/vi/ToU3D7IJjRA/0.jpg', 43, '2013-03-04', 6),
(7, 'chant', 'toto', 'musique', 'http://www.youtube.com/embed/yrnqmNqftFE', 'http://img.youtube.com/vi/yrnqmNqftFE/0.jpg', 16, '2013-02-12', 7);

-- --------------------------------------------------------

--
-- Structure de la table `vote`
--

CREATE TABLE `vote` (
  `id_vote` int(11) NOT NULL AUTO_INCREMENT,
  `date_vote` date NOT NULL,
  `id_utilisateur` int(11) DEFAULT NULL,
  `id_video` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_vote`),
  UNIQUE KEY `id_vote` (`id_vote`),
  KEY `id_utilisateur` (`id_utilisateur`),
  KEY `id_video` (`id_video`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `vote`
--

INSERT INTO `vote` (`id_vote`, `date_vote`, `id_utilisateur`, `id_video`) VALUES
(1, '2013-04-17', 1, 4),
(2, '2013-05-16', 6, 1),
(3, '2013-10-12', 7, 2),
(4, '2013-04-15', 1, 3),
(5, '2013-04-21', 6, 3);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `commentaire`
--
ALTER TABLE `commentaire`
  ADD CONSTRAINT `commentaire_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id_utilisateur`),
  ADD CONSTRAINT `commentaire_ibfk_2` FOREIGN KEY (`id_video`) REFERENCES `video` (`id_video`);

--
-- Contraintes pour la table `participe`
--
ALTER TABLE `participe`
  ADD CONSTRAINT `participe_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id_utilisateur`),
  ADD CONSTRAINT `participe_ibfk_2` FOREIGN KEY (`id_tournoi`) REFERENCES `tournoi` (`id_tournoi`);

--
-- Contraintes pour la table `video`
--
ALTER TABLE `video`
  ADD CONSTRAINT `video_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id_utilisateur`);

--
-- Contraintes pour la table `vote`
--
ALTER TABLE `vote`
  ADD CONSTRAINT `vote_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id_utilisateur`),
  ADD CONSTRAINT `vote_ibfk_2` FOREIGN KEY (`id_video`) REFERENCES `video` (`id_video`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
