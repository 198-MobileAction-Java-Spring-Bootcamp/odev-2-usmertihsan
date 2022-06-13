package com.usmertihsan.Homework2.Address.controller;


import com.usmertihsan.Homework2.Address.dto.AddressDto;
import com.usmertihsan.Homework2.Address.dto.AddressSaveRequestDto;
import com.usmertihsan.Homework2.Address.entity.Address;
import com.usmertihsan.Homework2.Address.dao.IAddressDao;
import com.usmertihsan.Homework2.Address.service.IAddressService;
import com.usmertihsan.Homework2.City.dto.CityDto;
import com.usmertihsan.Homework2.City.dto.CitySaveRequestDto;
import com.usmertihsan.Homework2.City.service.ICityService;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;
import com.usmertihsan.Homework2.Country.service.ICountryService;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;
import com.usmertihsan.Homework2.District.service.IDistrictService;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import com.usmertihsan.Homework2.Neighborhood.service.INeighborhoodService;
import com.usmertihsan.Homework2.Street.dao.IStreetDao;
import com.usmertihsan.Homework2.Street.dto.StreetSaveRequestDto;
import com.usmertihsan.Homework2.Street.entity.Street;
import com.usmertihsan.Homework2.Street.service.IStreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/addresses")
public class AddressController {

   // SERVICES
    private final IAddressService addressService;
    private final ICityService cityService;
    private final ICountryService countryService;
    private final IDistrictService districtService;
    private final INeighborhoodService neighborhoodService;
    private final IStreetService streetService;

    // SAVE NEW ADDRESS

    @PostMapping("/newAddress")
    public ResponseEntity saveNewAddress(@RequestBody AddressSaveRequestDto addressSaveRequestDto){
        addressService.saveNewAddress(addressSaveRequestDto);
        return new ResponseEntity(addressSaveRequestDto, HttpStatus.CREATED);
    }

    // DELETE ADDRESS BY GIVEN ID
    @DeleteMapping("deleteAddress/{id}")
    public ResponseEntity deleteAddress(@RequestParam Long id){
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

    // FIND ADDRESS WITH GIVEN ID

    @GetMapping("/findByAddressId")
    public ResponseEntity findByAddressId(@RequestParam Long addressId){
        List<AddressDto> addressDtoList = addressService.findByAddressId(addressId);
        return ResponseEntity.ok(addressDtoList);
    }


    // SAVE NEW COUNTRY
    @PostMapping("/newCountry")
    public ResponseEntity saveNewCountry(@RequestBody CountrySaveRequestDto countrySaveRequestDto){
        countryService.saveNewCountry(countrySaveRequestDto);
        return new ResponseEntity(countrySaveRequestDto, HttpStatus.CREATED);
    }



    // FIND COUNTRY WITH GIVEN COUNTRY CODE
    @GetMapping("/findCountryWithCountryCode/{countryCode}")
    public ResponseEntity findCountryWithCountryCode(@RequestParam String countryCode){
        List<CountryDto> countryDtoList = countryService.findByCountryCode(countryCode);
        return ResponseEntity.ok().build();
    }

    // SAVE NEW CITY
    @PostMapping("/newCity")
    public ResponseEntity saveNewCity(@RequestBody CitySaveRequestDto citySaveRequestDto){
        cityService.saveNewCity(citySaveRequestDto);
        return new ResponseEntity(citySaveRequestDto, HttpStatus.CREATED);
    }

    // FIND CITY WITH GIVEN PLATE NO
    @GetMapping("/findCityWithCityPlateNo/{cityPlateNo}")
    public ResponseEntity findCityWithCityPlateNo(@RequestParam String cityPlateNo){
        List<CityDto> cityDtoList = cityService.findByCityPlateNo(cityPlateNo);
        return ResponseEntity.ok(cityDtoList);
    }

    // SAVE NEW DISTRICT
    @PostMapping("/newDistrict")
    public ResponseEntity saveNewDistrict(@RequestBody DistrictSaveRequestDto districtSaveRequestDto){
        districtService.saveNewDistrict(districtSaveRequestDto);
        return new ResponseEntity(districtSaveRequestDto, HttpStatus.CREATED);
    }


    // SAVE NEW NEIGHBORHOOD
    @PostMapping("/newNeighborhood")
    public ResponseEntity saveNewNeighborhood(@RequestBody NeighborhoodSaveRequestDto neighborhoodSaveRequestDto){
        neighborhoodService.saveNewNeighborhood(neighborhoodSaveRequestDto);
        return new ResponseEntity(neighborhoodSaveRequestDto, HttpStatus.CREATED);
    }

    // update neighborhood name
    @PatchMapping("/updateNeighborhoodName/{id}")
    public ResponseEntity updateNeighborhoodName(@PathVariable Long id, String neighborhoodName){

        Neighborhood neighborhood = neighborhoodService.updateNeighborhoodName(neighborhoodName,id);
        return ResponseEntity.ok().build();
    }

    // SAVE NEW STREET
    @PostMapping("/newStreet")
    public ResponseEntity saveNewStreet(@RequestBody StreetSaveRequestDto streetSaveRequestDto){
        streetService.saveNewStreet(streetSaveRequestDto);
        return new ResponseEntity(streetSaveRequestDto, HttpStatus.CREATED);
    }


    // update street name
    @PatchMapping("/updateStreetName/{id}")
    public ResponseEntity updateStreetName(@RequestParam Long id, String newStreetName){

        Street street = streetService.updateStreetName(id,newStreetName);

        return ResponseEntity.ok().build();
    }










}
