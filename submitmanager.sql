-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- ホスト: 127.0.0.1
-- 生成日時: 2024-10-31 03:11:04
-- サーバのバージョン： 10.4.18-MariaDB
-- PHP のバージョン: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- データベース: `submitmanager`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `account`
--

CREATE TABLE `account` (
  `Id` int(11) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `Authority` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `classroom`
--

CREATE TABLE `classroom` (
  `Id` int(11) NOT NULL,
  `Classname` varchar(64) NOT NULL,
  `Account` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `comment`
--

CREATE TABLE `comment` (
  `Id` int(11) NOT NULL,
  `Progress` int(11) NOT NULL,
  `Author` int(11) NOT NULL,
  `Content` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `progress`
--

CREATE TABLE `progress` (
  `Id` int(11) NOT NULL,
  `Subject` int(11) NOT NULL,
  `Targetaccount` int(11) NOT NULL,
  `Checked` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `subject`
--

CREATE TABLE `subject` (
  `Id` int(11) NOT NULL,
  `Subjectname` varchar(64) NOT NULL,
  `Classroom` int(11) NOT NULL,
  `Administrator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `task`
--

CREATE TABLE `task` (
  `Id` int(11) NOT NULL,
  `Subject` int(11) NOT NULL,
  `Classroom` int(11) NOT NULL,
  `Deadline` date DEFAULT NULL,
  `Information` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- ダンプしたテーブルのインデックス
--

--
-- テーブルのインデックス `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Id`);

--
-- テーブルのインデックス `classroom`
--
ALTER TABLE `classroom`
  ADD PRIMARY KEY (`Id`) USING BTREE;

--
-- テーブルのインデックス `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`Id`) USING BTREE;

--
-- テーブルのインデックス `progress`
--
ALTER TABLE `progress`
  ADD PRIMARY KEY (`Id`) USING BTREE;

--
-- テーブルのインデックス `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`Id`);

--
-- テーブルのインデックス `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`Id`) USING BTREE;

--
-- ダンプしたテーブルの AUTO_INCREMENT
--

--
-- テーブルの AUTO_INCREMENT `account`
--
ALTER TABLE `account`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- テーブルの AUTO_INCREMENT `classroom`
--
ALTER TABLE `classroom`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- テーブルの AUTO_INCREMENT `comment`
--
ALTER TABLE `comment`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- テーブルの AUTO_INCREMENT `progress`
--
ALTER TABLE `progress`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- テーブルの AUTO_INCREMENT `subject`
--
ALTER TABLE `subject`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- テーブルの AUTO_INCREMENT `task`
--
ALTER TABLE `task`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
