-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2016 at 01:17 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `housing`
--

-- --------------------------------------------------------

--
-- Table structure for table `hostelpg`
--

CREATE TABLE IF NOT EXISTS `hostelpg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '1',
  `title` varchar(200) NOT NULL,
  `area` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `main_image` text NOT NULL,
  `price` varchar(100) NOT NULL,
  `short_tag` text NOT NULL,
  `description` text NOT NULL,
  `contact_no` varchar(15) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `hostelpg`
--

INSERT INTO `hostelpg` (`id`, `user_id`, `title`, `area`, `address`, `city`, `main_image`, `price`, `short_tag`, `description`, `contact_no`, `created_at`) VALUES
(1, 1, 'Luxurious Girls PG Spire Homes Girls Hostel Dehradun', 'Clement Town', 'Clement Town', 'Dehradun', 'images/hostel/1.jpg\r\n', '10,000', '', '', '9690415953', '2016-05-12 02:10:37'),
(2, 1, 'pg, best 4 sgrr girls.near sabji mandi.', 'Mohit Vihar', 'Mohit Vihar', 'Dehradun', 'images/hostel/2.jpg', '7,500', '', '', '', '2016-05-12 02:10:45'),
(3, 1, 'Pg for girls on sahastradhara road', 'Dehradun', 'Dehradun', 'Dehradun', 'images/hostel/3.jpg', '6,500', '', '', '', '2016-05-12 02:10:52'),
(4, 1, 'Best boys hostel of dehradun', 'Best boys hostel of dehradun', 'Raipur Area, Dehradun', 'Dehradun', 'images/hostel/1.jpg', '4,000', '', '', '', '2016-05-12 02:11:00'),
(5, 1, 'Accommodation for girl', 'Indresh Nagar', 'Dehradun', 'Dehradun', 'images/hostel/2.jpg', '2,000', '', '', '', '2016-05-12 02:11:07'),
(6, 1, 'Pg & Rent room available', 'Rajpur Road Enclave', 'Rajpur Road Enclave, Dehradun', 'Dehradun', 'images/hostel/3.jpg', '5,000', '', '', '', '2016-05-12 02:11:14'),
(12, 1, 'bisht home', 'seemadwar', 'itbp seemadwar', 'Dehradun', '', '23000', '3 bhk', 'cjhgh\nhghh\nhhhj\nghhh\ngghh\ngg\n', '9760886921', '2016-05-12 02:11:22'),
(13, 4, 'a', 'b', 'c', 'Dehradun', '', '120000', 'e', 'f', '9760886921', '2016-05-12 02:13:09'),
(14, 2, '', '', '', '', '', '', '', '', '', '2016-05-12 02:18:11');

-- --------------------------------------------------------

--
-- Table structure for table `house`
--

CREATE TABLE IF NOT EXISTS `house` (
  `user_id` int(11) NOT NULL DEFAULT '1',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `main_image` text NOT NULL,
  `price` varchar(100) NOT NULL,
  `short_tag` text NOT NULL,
  `description` text NOT NULL,
  `contact_no` varchar(15) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `house`
--

INSERT INTO `house` (`user_id`, `id`, `title`, `area`, `address`, `city`, `main_image`, `price`, `short_tag`, `description`, `contact_no`, `created_at`) VALUES
(0, 1, '2 Bedroom House T', 'Kargi Chowk', 'hdc Colony Banjarawala Near Kargi Chowk Dehradun', 'Dehradun', 'images/house/1.jpg', '10,000,00', '', '', '', '2016-05-09 09:15:12'),
(0, 2, 'Independent House ', 'Vindra Enclave Banjarawala', 'Prem Nagar, Dehradun', 'Dehradun', 'images/house/2.jpg', '20,000,000', '', '', '', '2016-05-09 09:15:25'),
(0, 3, '2Bhk House Sell ', 'In Banjarawala', 'Dehradun', 'Dehradun', 'images/house/1.jpg', '50,000,00', '', '', '', '2016-05-09 09:15:37'),
(0, 4, 'Aw Awesome House 3bhk in Shantivihar', 'Prem Nagar, Dehradun', 'Dehradun', 'Dehradun', 'images/house/2.jpg', '16,50,100', '', '', '', '2016-05-09 09:15:59');

-- --------------------------------------------------------

--
-- Table structure for table `messages`
--

CREATE TABLE IF NOT EXISTS `messages` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_from` int(11) NOT NULL,
  `user_to` int(11) NOT NULL,
  `message` text NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `category` varchar(100) NOT NULL,
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `messages`
--

INSERT INTO `messages` (`message_id`, `user_from`, `user_to`, `message`, `created_at`, `category`, `product_id`) VALUES
(1, 0, 1, 'hello gb', '2016-05-12 01:42:00', 'hostelpg', 1),
(2, 2, 4, 'sent message detail', '2016-05-12 02:25:45', 'hostelpg', 13),
(3, 4, 2, 'hello', '2016-05-12 03:11:03', 'hostelpg', 13),
(4, 4, 2, 'hello again', '2016-05-12 03:17:33', 'hostelpg', 13);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL DEFAULT '1',
  `title` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `main_image` text NOT NULL,
  `price` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `short_tag` text NOT NULL,
  `description` text NOT NULL,
  `contact_no` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`id`, `user_id`, `title`, `area`, `address`, `city`, `main_image`, `price`, `created_at`, `short_tag`, `description`, `contact_no`) VALUES
(0, 0, 'Rajpur Greens', 'Rajpur Road', '218/213, Adjacent to GRD Hostel', 'Dehradun', 'images/house/1.jpg', '50,00,000', '2016-05-09 09:16:13', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `rentlease`
--

CREATE TABLE IF NOT EXISTS `rentlease` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '1',
  `title` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `main_image` text NOT NULL,
  `price` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `short_tag` int(11) NOT NULL,
  `description` int(11) NOT NULL,
  `contact_no` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `rentlease`
--

INSERT INTO `rentlease` (`id`, `user_id`, `title`, `area`, `address`, `city`, `main_image`, `price`, `created_at`, `short_tag`, `description`, `contact_no`) VALUES
(1, 0, '2 bhk ind for official use rajender nagar', ' Kamla Nagar, Dehradun', 'Dehradun', 'Dehradun', '', '', '2016-05-09 08:34:41', 0, 0, 0),
(2, 0, '1BHK at Ground floor Ballupur Chowk ', 'near synergy hospital for family', 'Dehradun', 'Dehradun', '', '', '2016-05-09 08:35:25', 0, 0, 0),
(3, 0, '2 room set ground floor for family', 'Mahendar vihar ', 'Mahendar vihar , Dehradun', 'Dehradun', '', '', '2016-05-09 08:36:24', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `user_reg`
--

CREATE TABLE IF NOT EXISTS `user_reg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(100) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `user_reg`
--

INSERT INTO `user_reg` (`id`, `city`, `emailid`, `password`, `name`) VALUES
(1, '', 'admin', 'housing', 'admin'),
(2, '', 'ganesh@gmail.com', 'ganesh', 'ganesh'),
(3, '', 'bhanu@gmail.com', 'kavita', 'bhanu'),
(4, '', 'kavyadnu@gmail.com', 'kavita', 'kavita');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
