-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Dim 17 Février 2013 à 15:19
-- Version du serveur: 5.1.53
-- Version de PHP: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `webphone`
--

-- --------------------------------------------------------

--
-- Structure de la table `avis`
--

CREATE TABLE IF NOT EXISTS `avis` (
  `ID_Avis` int(5) NOT NULL AUTO_INCREMENT,
  `ID_user` int(11) NOT NULL,
  `login` varchar(15) NOT NULL,
  `Date` date NOT NULL,
  `Commentaire` text NOT NULL,
  PRIMARY KEY (`ID_Avis`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=47 ;

--
-- Contenu de la table `avis`
--

INSERT INTO `avis` (`ID_Avis`, `ID_user`, `login`, `Date`, `Commentaire`) VALUES
(33, 46, 'Clem1', '2013-02-12', 'Super appli, je la recommande ! '),
(31, 44, 'Muriel', '2013-02-12', 'Cette appli est vraiment géniale !'),
(32, 45, 'Antonin1', '2013-02-12', 'Super appli, je la recommande à tous ! '),
(46, 50, 'Artween', '2013-02-14', 'Merci pr cette appli, elle est trop bien');

-- --------------------------------------------------------

--
-- Structure de la table `droits`
--

CREATE TABLE IF NOT EXISTS `droits` (
  `ID_droit` int(2) NOT NULL AUTO_INCREMENT COMMENT '1:Admin 2:User',
  `nom` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_droit`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `droits`
--

INSERT INTO `droits` (`ID_droit`, `nom`) VALUES
(1, 'Administrateur'),
(2, 'Utilisateurs');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `ID_user` int(5) NOT NULL AUTO_INCREMENT,
  `ID_droit` int(2) NOT NULL COMMENT '1:Admin 2:User',
  `login` varchar(15) NOT NULL,
  `Nom_user` varchar(20) NOT NULL,
  `Prenom_user` varchar(15) NOT NULL,
  `mdp` varchar(32) NOT NULL,
  `e-mail` varchar(50) NOT NULL,
  `Date_inscription` date NOT NULL,
  `Telechargement` varchar(3) NOT NULL,
  `Date_dl` date NOT NULL,
  PRIMARY KEY (`ID_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=61 ;

--
-- Contenu de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`ID_user`, `ID_droit`, `login`, `Nom_user`, `Prenom_user`, `mdp`, `e-mail`, `Date_inscription`, `Telechargement`, `Date_dl`) VALUES
(44, 1, 'Muriel', 'Lo-ying-seng', 'Muriel', 'f5413344a535e5a3b6efcf5a1995bd6c', 'muriel.lys@live.fr', '2013-02-12', 'oui', '2013-02-14'),
(45, 1, 'Antonin1', 'Cornut', 'Antonin', 'f5413344a535e5a3b6efcf5a1995bd6c', 'antonin@live.fr', '2013-02-12', 'oui', '2013-02-14'),
(46, 1, 'Clem1', 'Casamayou', 'Clément', 'f5413344a535e5a3b6efcf5a1995bd6c', 'clement.casamayou@gmail.com', '2013-02-12', 'oui', '2013-02-14'),
(47, 2, 'Sweety', 'Fruteau', 'Pauline', 'f5413344a535e5a3b6efcf5a1995bd6c', 'pauline@live.fr', '2013-02-12', '', '0000-00-00'),
(48, 2, 'SananesF', 'Sananes', 'Frédéric', 'f5413344a535e5a3b6efcf5a1995bd6c', 'sananes@live.fr', '2013-02-12', '', '0000-00-00'),
(49, 2, 'Fanta1', 'Coulibali', 'Fanta', 'f5413344a535e5a3b6efcf5a1995bd6c', 'fanta@hotmail.fr', '2013-02-12', '', '0000-00-00'),
(50, 1, 'Artween', 'Ferris', 'Alix', 'f5413344a535e5a3b6efcf5a1995bd6c', 'alixf@live.fr', '2013-02-12', '', '0000-00-00'),
(51, 2, 'Celia1', 'Ouissi', 'Célia', 'f5413344a535e5a3b6efcf5a1995bd6c', 'celia@live.fr', '2013-02-12', '', '0000-00-00'),
(52, 2, 'Jules1', 'Maurer', 'Jules', 'f5413344a535e5a3b6efcf5a1995bd6c', 'jujul@live.fr', '2013-02-12', '', '0000-00-00'),
(53, 2, 'Popo1', 'Huck', 'Pauline', 'f5413344a535e5a3b6efcf5a1995bd6c', 'esgipopo@live.com', '2013-02-12', '', '0000-00-00'),
(54, 2, 'JJ1234', 'Jack', 'Jean', 'abbd0fa0ba8b81d4498ce7c2eb59c132', 'bla@hotmail.com', '2013-02-12', '', '0000-00-00'),
(59, 2, 'Mama', 'Coulibali', 'Mamadou', 'f5413344a535e5a3b6efcf5a1995bd6c', 'mama@live.fr', '2013-02-14', '', '0000-00-00'),
(60, 2, 'Moitmoit1', 'Moittie', 'Vincent', 'f5413344a535e5a3b6efcf5a1995bd6c', 'vincent@live.fr', '2013-02-14', 'oui', '2013-02-14');
