package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "<h1>Dashboard Utilisateur</h1>" +
                "<p>Accès autorisé pour 'user'.</p>" +
                "<form action='/logout' method='post'>" +
                "<button type='submit'>Se déconnecter</button>" +
                "</form>";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "<h1>Dashboard Admin</h1>" +
                "<p>Accès autorisé pour 'admin'.</p>" +
                "<form action='/logout' method='post'>" +
                "<button type='submit'>Se déconnecter</button>" +
                "</form>";
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Bienvenue sur la page d'accueil !";
    }
}