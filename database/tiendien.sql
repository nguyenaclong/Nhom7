-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2022 at 04:42 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiendien`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `Bill_Id` bigint(20) NOT NULL,
  `Customer_Id` bigint(20) NOT NULL,
  `Elec_Number_Id` bigint(20) NOT NULL,
  `Total_Amount` bigint(20) NOT NULL,
  `Billing_Date` int(11) NOT NULL,
  `Account_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_Id` bigint(20) NOT NULL,
  `Customer_Name` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `CCCD` varchar(12) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Phone` varchar(10) NOT NULL,
  `Customer_Email` varchar(255) NOT NULL,
  `CCCD_Date` date NOT NULL,
  `CCCD_Place` varchar(255) NOT NULL,
  `Elec_Address` varchar(255) NOT NULL,
  `Elec_Phase` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_Id`, `Customer_Name`, `Address`, `CCCD`, `Birth_Date`, `Phone`, `Customer_Email`, `CCCD_Date`, `CCCD_Place`, `Elec_Address`, `Elec_Phase`) VALUES
(2, 'Nguyễn Đắc Long', '514 Đê La Thành', '001200043409', '2000-02-29', '0868993974', 'nguyenaclong@gmail.com', '2021-07-10', 'Hà Nội', '514 Đê La Thành', '1');

-- --------------------------------------------------------

--
-- Table structure for table `elecnumber`
--

CREATE TABLE `elecnumber` (
  `Elec_Id` bigint(20) NOT NULL,
  `Customer_Id` bigint(20) NOT NULL,
  `Old_Num` int(11) NOT NULL,
  `Old_Num_Date` date NOT NULL,
  `New_Num` int(11) NOT NULL,
  `New_Num_Date` date NOT NULL,
  `Recorded_Date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`) VALUES
(2, 'nguyenaclong@gmail.com', 'Long', 'Nguyen Dac', '$2a$10$ey4htW9qec9pweox3EHwz.zEAri9cY8LQ7y.rCJ4Z5gedTFzur9Z2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`Bill_Id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_Id`);

--
-- Indexes for table `elecnumber`
--
ALTER TABLE `elecnumber`
  ADD PRIMARY KEY (`Elec_Id`),
  ADD KEY `Customer_Id` (`Customer_Id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `Bill_Id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Customer_Id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `elecnumber`
--
ALTER TABLE `elecnumber`
  MODIFY `Elec_Id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
