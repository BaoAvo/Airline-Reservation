//package com.example.airlinereservation.service;
//
//import com.example.airlinereservation.repository.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class CustomerService implements UserDetailsService {
//    private UserRepository userRepository;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//    private final String USER_NOT_FOUND_MSG ="Email %s not fond";
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        return (UserDetails) userRepository.findByEmail(email).
//                orElseThrow(() ->
//                        new UsernameNotFoundException(
//                                String.format(USER_NOT_FOUND_MSG,email)));
//    }
////    public String signUpUser(UserDetail user) {
////        boolean userExists = userRepository.findByEmail(user.getEmail())
////                .isPresent();
////        String result = "";
////        if(userExists){
//////            throw new IllegalAccessException("Email already taken");
////            result = "Email already exist";
////        }else {
////            String encodePassword = bCryptPasswordEncoder.
////                    encode(user.getPassword());
////            user.setPassword(encodePassword);
////            userRepository.save(user);
////
////            result =  "Sign Up Successfully";
////        }
////        return result;
////    }
//}
